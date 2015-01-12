/*
 * Copyright 2015 Riccardo Tasso
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.raymanrt.orient.query;

import it.raymanrt.orient.query.projection.AtomicProjection;

public class FetchingStrategy {
    public static int ONLY_CURRENT = 0;
    public static int UNLIMITED = -1;
    public static int EXCLUDE_CURRENT = -2;

    private Projection fieldPath;
    private int depthLevel;

    public FetchingStrategy(Projection fieldPath, int depthLevel) {
        this.fieldPath = fieldPath;
        this.depthLevel = depthLevel;
    }

    public FetchingStrategy(String fieldName, int depthLevel) {
        this.fieldPath = new AtomicProjection(fieldName);
        this.depthLevel = depthLevel;
    }

    public String toString() {
        return fieldPath.toString() + ":" + Integer.toString(depthLevel);
    }

}