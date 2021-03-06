/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;

/** @author xpenatan */
public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape {

    public btConvexHullShape() {
        resetObj(createNative(), true);
    }

    public static long createNative() {
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(new Bullet.btConvexHullShape());",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btConvexHullShape);",this);
	}

    public void addPoint(Vector3 point) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",point.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",point.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",point.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);vec.setValue(x,y,z);jsObj.addPoint(vec,true);",this);
    }

    public void addPoint(Vector3 point, boolean recalculateLocalAabb) {
		com.dragome.commons.javascript.ScriptHelper.put("recalculateLocalAabb",recalculateLocalAabb,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",point.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",point.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",point.z,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.MyTemp.prototype.btVec3_1(x,y,z);jsObj.addPoint(vec,recalculateLocalAabb);",this);
    }
}
