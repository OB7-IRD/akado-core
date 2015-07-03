/*
 * $Id$
 *
 * Copyright (C) 2014 Observatoire thonier, IRD
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.ird.akado.core.selector;

/**
 *
 * @author Julien Lebranchu <julien.lebranchu@ird.fr>
 * @param <T>
 * @since 2.0
 * @date 21 mai 2014
 *
 *
 * $LastChangedDate$
 *
 * $LastChangedRevision$
 *
 */
public abstract class AbstractSelectionCriteria<T> {

    T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

}