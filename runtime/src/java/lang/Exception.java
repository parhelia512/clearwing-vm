/*
 * Copyright (c) 2012, Codename One and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Codename One designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *  
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Codename One through http://www.codenameone.com/ if you 
 * need additional information or have any questions.
 */

package java.lang;
/**
 * The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
 * Since: JDK1.0, CLDC 1.0 See Also:Error
 */
public class Exception extends java.lang.Throwable{
    /**
     * Constructs an Exception with no specified detail message.
     */
    public Exception(){
         //TODO codavaj!!
    }

    /**
     * Constructs an Exception with the specified detail message.
     * s - the detail message.
     */
    public Exception(java.lang.String s){
         super(s);
    }
    
    public Exception(Throwable cause) {
        super(cause);
    }
    
    public Exception(java.lang.String s, Throwable cause) {
        super(s, cause);
    }

    protected Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
