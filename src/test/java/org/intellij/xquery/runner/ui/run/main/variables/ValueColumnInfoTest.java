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

package org.intellij.xquery.runner.ui.run.main.variables;

import org.intellij.xquery.runner.state.run.XQueryRunVariable;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.intellij.xquery.runner.ui.run.main.variables.ValueColumnInfo.HEADER;
import static org.junit.Assert.assertThat;

/**
 * User: ligasgr
 * Date: 09/11/13
 * Time: 21:38
 */
public class ValueColumnInfoTest {

    private ValueColumnInfo columnInfo;

    @Before
    public void setUp() throws Exception {
        columnInfo = new ValueColumnInfo();
    }

    @Test
    public void shouldReturnHeader() {
        assertThat(columnInfo.getName(), is(HEADER));
    }

    @Test
    public void shouldReturnValueOfVariable() {
        XQueryRunVariable variable = new XQueryRunVariable();
        String value = "value";
        variable.setValue(value);

        String result = columnInfo.valueOf(variable);

        assertThat(result, is(value));
    }
}
