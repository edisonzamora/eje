/**
 * LibrosMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.libreria.libros;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LibrosMessageReceiverInOut message receiver
 */
public class LibrosMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {
		try {
//			ClassLoader cl=ClassLoader.getSystemClassLoader();
//			createSpringAppCtx(cl);
			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			LibrosSkeleton skel = (LibrosSkeleton) obj;

			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;

			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();

			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;

			if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils
					.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {
				if ("buscarLibro".equals(methodName)) {
					com.libreria.libros.LibrosResponse librosResponse9 = null;
					com.libreria.libros.LibrosRequest wrappedParam = (com.libreria.libros.LibrosRequest) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.libreria.libros.LibrosRequest.class);

					librosResponse9 = skel.buscarLibro(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), librosResponse9, false,
							new javax.xml.namespace.QName("http://libreria.com/Libros/", "librosResponse"));
				} else if ("addLibro".equals(methodName)) {
					com.libreria.libros.AddLibrosResponse addLibrosResponse11 = null;
					com.libreria.libros.AddLibrosRequest wrappedParam = (com.libreria.libros.AddLibrosRequest) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							com.libreria.libros.AddLibrosRequest.class);

					addLibrosResponse11 = skel.addLibro(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), addLibrosResponse11, false,
							new javax.xml.namespace.QName("http://libreria.com/Libros/", "addLibrosResponse"));
				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM(com.libreria.libros.LibrosRequest param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(com.libreria.libros.LibrosRequest.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(com.libreria.libros.LibrosResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(com.libreria.libros.LibrosResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(com.libreria.libros.AddLibrosRequest param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(com.libreria.libros.AddLibrosRequest.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.om.OMElement toOM(com.libreria.libros.AddLibrosResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			return param.getOMElement(com.libreria.libros.AddLibrosResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.libreria.libros.LibrosResponse param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(com.libreria.libros.LibrosResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.libreria.libros.LibrosResponse wrapbuscarLibro() {
		com.libreria.libros.LibrosResponse wrappedElement = new com.libreria.libros.LibrosResponse();

		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			com.libreria.libros.AddLibrosResponse param, boolean optimizeContent,
			javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody()
					.addChild(param.getOMElement(com.libreria.libros.AddLibrosResponse.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.libreria.libros.AddLibrosResponse wrapaddLibro() {
		com.libreria.libros.AddLibrosResponse wrappedElement = new com.libreria.libros.AddLibrosResponse();

		return wrappedElement;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
			throws org.apache.axis2.AxisFault {
		try {
			if (com.libreria.libros.AddLibrosRequest.class.equals(type)) {
				return com.libreria.libros.AddLibrosRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (com.libreria.libros.AddLibrosResponse.class.equals(type)) {
				return com.libreria.libros.AddLibrosResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (com.libreria.libros.LibrosRequest.class.equals(type)) {
				return com.libreria.libros.LibrosRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (com.libreria.libros.LibrosResponse.class.equals(type)) {
				return com.libreria.libros.LibrosResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

		return null;
	}

	private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();

		if (cause != null) {
			f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
		} else {
			f = new org.apache.axis2.AxisFault(e.getMessage());
		}

		return f;
	}

//	 public void createSpringAppCtx(ClassLoader cl)
//	            throws Exception {
//
//	    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//	           ctx.setClassLoader(cl);
//	           ctx.refresh();
//	}
} // end of class
