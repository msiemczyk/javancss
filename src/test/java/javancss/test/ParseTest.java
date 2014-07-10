/*
Copyright (C) 2000 Chr. Clemens Lee <clemens@kclee.com>.

This file is part of JavaNCSS
(http://www.kclee.com/clemens/java/javancss/).

JavaNCSS is free software; you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation; either version 2, or (at your option) any
later version.

JavaNCSS is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with JavaNCSS; see the file COPYING.  If not, write to
the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA 02111-1307, USA.  */

package javancss.test;

import javancss.Javancss;
import ccl.util.Test;

public class ParseTest
    extends AbstractTest
{

    private void testParse()
    {
        _enterSubTest( "parse" );

        _checkParse( 48 );

        _checkParse( 50 );

        _checkParse( 142 ); // JAVANCSS-12
        _checkParse( 143 ); // JAVANCSS-9
        _checkParse( 144 ); // JAVANCSS-13
        _checkParse( 145 ); // JAVANCSS-14
        _checkParse( 146 ); // JAVANCSS-17
        // TODO 147? anonymous subcluss
        _checkParse( 148 ); // JAVANCSS-49
        _checkParse( 149 ); // JAVANCSS-46
        _checkParse( 150 ); // JAVANCSS-53 
        _checkParse( 151 ); // JAVANCSS-45 
        _checkParse( 152 ); // JAVANCSS-57
        _checkParse( 153 ); // JAVANCSS-54
        // TODO PK _checkParse( 154 ); // JAVANCSS-52 open!

        _exitSubTest();
    }

    private void _checkParse( int testFile )
    {
        Javancss pJavancss = measureTestFile( testFile );
        bugIf( pJavancss.getNcss() <= 0, "Parsing file Test" + testFile + ".java failed!" );
    }

    public ParseTest()
    {
        super();
    }

    public ParseTest( Test pTest_ )
    {
        super( pTest_ );
    }

    /**
     * Test code goes here.
     */
    @Override
    protected void _doIt()
    {
        testParse();
    }

    public static void main( String[] asArg_ )
    {
        new ParseTest().main();
    }

}