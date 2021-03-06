# Copyright (C) 2008, The Perl Foundation.

=head1 NAME

t/php/concat.t - testing concatenation

=head1 SYNOPSIS

    perl t/harness t/php/concat.t

=head1 DESCRIPTION

Concatenate various thingies.

=cut

# pragmata
use strict;
use warnings;
use FindBin;
use lib "$FindBin::Bin/../../../../lib", "$FindBin::Bin/../../lib";

use Pipp::Test tests => 3;

language_output_is( 'Pipp', <<'CODE', <<'OUT', 'concatenate 2 strings' );
<?php
echo '1' . "a\n"
?>
CODE
1a
OUT

language_output_is( 'Pipp', <<'CODE', <<'OUT', 'concatenate four strings' );
<?php
echo 'Hell' . 'o, ' . 'World!' . "\n"
?>
CODE
Hello, World!
OUT

language_output_is( 'Pipp', <<'CODE', <<'OUT', 'concatenate an int and a string' );
<?php
echo 1 . "a\n"
?>
CODE
1a
OUT

# Local Variables:
#   mode: cperl
#   cperl-indent-level: 4
#   fill-column: 100
# End:
# vim: expandtab shiftwidth=4:
