/*
 * Password Management Servlets (PWM)
 * http://www.pwm-project.org
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2018 The PWM Project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package password.pwm.svc.wordlist;

import password.pwm.PwmApplication;
import password.pwm.error.PwmException;
import password.pwm.error.PwmUnrecoverableException;
import password.pwm.util.logging.PwmLogger;


/**
 * @author Jason D. Rivard
 */
public class WordlistService extends AbstractWordlist implements Wordlist
{
    private static final PwmLogger LOGGER = PwmLogger.forClass( WordlistService.class );

    public WordlistService( )
    {
    }

    public void init( final PwmApplication pwmApplication ) throws PwmException
    {
        super.init( pwmApplication, WordlistType.WORDLIST );
    }

    @Override
    PwmLogger getLogger()
    {
        return LOGGER;
    }

    @Override
    public boolean containsWord( final String word ) throws PwmUnrecoverableException
    {
        return super.containsWord( word );
    }
}
