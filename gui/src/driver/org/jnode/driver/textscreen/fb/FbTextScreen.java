/*
 * $Id$
 *
 * JNode.org
 * Copyright (C) 2003-2006 JNode.org
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; If not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.jnode.driver.textscreen.fb;

import org.jnode.driver.textscreen.x86.AbstractPcBufferTextScreen;
import org.jnode.driver.video.Surface;


class FbTextScreen extends AbstractPcBufferTextScreen {
    private static final int SCREEN_WIDTH = 80;
    private static final int SCREEN_HEIGHT = 25;
    
    private final FbScreenPainter painter;

    public FbTextScreen(Surface g) {
        super(SCREEN_WIDTH, SCREEN_HEIGHT, true); // true = ignore colors
        painter = new FbScreenPainter(this, g);
    }

    @Override
    protected void sync(int offset, int length) {
        painter.repaint();
    }

    public char[] getScreenBuffer() {
        return getBuffer();
    }
}
