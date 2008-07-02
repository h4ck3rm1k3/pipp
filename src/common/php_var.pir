# Copyright (C) 2008, The Perl Foundation.
# $Id$

=head1 NAME

php_var.pir - PHP var Standard Library

=head1 DESCRIPTION

=head2 Functions

=over 4

=cut

=item C<void debug_zval_dump(mixed var)>

Dumps a string representation of an internal zend value to output.

NOT IMPLEMENTED.

=cut

.sub 'debug_zval_dump'
    not_implemented()
.end

=item C<int memory_get_peak_usage([real_usage])>

Returns the peak allocated by PHP memory

NOT IMPLEMENTED.

=cut

.sub 'memory_get_peak_usage'
    not_implemented()
.end

=item C<int memory_get_usage([real_usage])>

Returns the allocated by PHP memory

NOT IMPLEMENTED.

=cut

.sub 'memory_get_usage'
    not_implemented()
.end

=item C<string serialize(mixed variable)>

Returns a string representation of variable (which can later be unserialized)

NOT IMPLEMENTED.

=cut

.sub 'serialize'
    not_implemented()
.end

=item C<mixed unserialize(string variable_representation)>

Takes a string representation of variable and recreates it

NOT IMPLEMENTED.

=cut

.sub 'unserialize'
    not_implemented()
.end

=item C<void var_dump(mixed var)>

Dumps a string representation of variable to output

=cut

.include "library/dumper.pir"
.include "cclass.pasm"

# TODO: pass in indent_level, proper escaping
.sub var_dump
    .param pmc a

    .local string type_of_pmc
    type_of_pmc = typeof a

    ne type_of_pmc, 'string', not_a_string
        .local int string_len

        string_len = elements a
        print 'string('
        print string_len
        print ') "'
        print a
        print '"'
        say ''

       .return()

not_a_string:

    ne type_of_pmc, 'array', not_a_hash

        .local int num_elements
        num_elements = elements a
        string_len = elements a
        print 'array('
        print num_elements
        say ') {'

        .local pmc    iter, val
        .local string indent, key
        .local int    key_starts_with_digit
        indent = '  '
        new iter, .Iterator, a
        set iter, 0
iter_loop:
    unless iter, iter_end
        shift key, iter
        # TODO: ugly workaround as Hash keys are stringified
        key_starts_with_digit = is_cclass .CCLASS_NUMERIC, key, 0
        print indent
        print '['
        if key_starts_with_digit goto key_is_an_integer_1
            print '"'
key_is_an_integer_1:
        print key
        if key_starts_with_digit goto key_is_an_integer_2
            print '"'
key_is_an_integer_2:
        say ']=>'
        print indent
        val = a[key]
        var_dump(val)

        branch iter_loop
iter_end:


        say '}'
       .return()

not_a_hash:

    ne type_of_pmc, 'integer', not_a_integer

        print 'int('
        print a
        say ')'

       .return()

not_a_integer:

    _dumper(a)

    .return()
.end

=item C<mixed var_export(mixed var [, bool return])>

Outputs or returns a string representation of a variable

NOT IMPLEMENTED.

=cut

.sub 'var_export'
    not_implemented()
.end

=back

=cut

# Local Variables:
#   mode: pir
#   fill-column: 100
# End:
# vim: expandtab shiftwidth=4 ft=pir: