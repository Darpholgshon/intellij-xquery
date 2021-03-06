/*
 * Copyright 2013 Grzegorz Ligas <ligasgr@gmail.com> and other contributors (see the CONTRIBUTORS file).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.xquery;

import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

/**
 * User: ligasgr
 * Date: 10/11/13
 * Time: 20:58
 */
public class CheatingIdeaApplicationManager extends ApplicationManager{
    private static Application oldInstance;
    public static void removeApplication() {
        oldInstance = ourApplication;
        ourApplication = null;
    }

    public static void restoreApplication() {
        ourApplication = oldInstance;
    }
}
