/**
 * Copyright (c) Codice Foundation
 *
 * <p>This is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details. A copy of the GNU Lesser General Public
 * License is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 */
package org.codice.alliance.transformer.nitf.image;

import org.codice.alliance.transformer.nitf.AbstractNitfMetacardType;

public class ImageMetacardType extends AbstractNitfMetacardType {

  private static final String NAME = "isr.image";

  public ImageMetacardType() {
    super(NAME, null);
    this.initDescriptors();
  }

  @Override
  public void initDescriptors() {
    descriptors.addAll(getDescriptors(GraphicAttribute.values()));
    descriptors.addAll(getDescriptors(ImageAttribute.getAttributes()));
    descriptors.addAll(getDescriptors(LabelAttribute.values()));
    descriptors.addAll(getDescriptors(SymbolAttribute.values()));
    descriptors.addAll(getDescriptors(TextAttribute.values()));
  }
}
