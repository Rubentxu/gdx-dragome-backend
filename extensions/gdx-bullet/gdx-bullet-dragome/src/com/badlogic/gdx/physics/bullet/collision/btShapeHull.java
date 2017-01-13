/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

/** @author xpenatan */
public class btShapeHull extends BulletBase {

    public btShapeHull(btConvexShape shape) {
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btShapeHull);",this);
	}

    public boolean buildHull(float margin) {
		com.dragome.commons.javascript.ScriptHelper.put("margin",margin,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.buildHull(margin);",this);
    }

    public int numTriangles() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.numTriangles();",this);
    }

    public int numVertices() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.numVertices();",this);
    }

    public int numIndices() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.numIndices();",this);
    }

    public btVector3[] getVertexPointer() {
        throw new RuntimeException("getVertexPointer not implemented");
    }

    public java.nio.LongBuffer getIndexPointer() {
        throw new RuntimeException("getIndexPointer not implemented");
    }
}
