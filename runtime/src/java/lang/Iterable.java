/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package java.lang;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/**
 * Objects of classes that implement this interface can be used within a
 * {@code foreach} statement.
 *
 * @since 1.5
 */
public interface Iterable<T> {

    /**
     * Returns an {@link Iterator} for the elements in this object.
     * 
     * @return An {@code Iterator} instance.
     */
    Iterator<T> iterator();

    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        Iterator var2 = this.iterator();

        while(var2.hasNext()) {
            T t = (T)var2.next();
            action.accept(t);
        }

    }

    default Spliterator<T> spliterator() {
        return Spliterators.spliteratorUnknownSize(this.iterator(), 0);
    }
}
