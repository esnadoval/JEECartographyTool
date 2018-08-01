/**
 * Generated with Acceleo
 */
package CartographyDescription.providers;

import CartographyDescription.parts.CartographyDescriptionViewsRepository;

import CartographyDescription.parts.forms.AnnotatedObjectPropertiesEditionPartForm;
import CartographyDescription.parts.forms.AnnotationParameterPropertiesEditionPartForm;
import CartographyDescription.parts.forms.AnnotationPropertiesEditionPartForm;
import CartographyDescription.parts.forms.ApplicationPropertiesEditionPartForm;
import CartographyDescription.parts.forms.AttributePropertiesEditionPartForm;
import CartographyDescription.parts.forms.BussinessPropertiesEditionPartForm;
import CartographyDescription.parts.forms.CartographyElementPropertiesEditionPartForm;
import CartographyDescription.parts.forms.Class_PropertiesEditionPartForm;
import CartographyDescription.parts.forms.ConstructorPropertiesEditionPartForm;
import CartographyDescription.parts.forms.ElementRelationPropertiesEditionPartForm;
import CartographyDescription.parts.forms.EntityPropertiesEditionPartForm;
import CartographyDescription.parts.forms.EnumLiteralPropertiesEditionPartForm;
import CartographyDescription.parts.forms.EnumLiteralvaluePropertiesEditionPartForm;
import CartographyDescription.parts.forms.EnumerationPropertiesEditionPartForm;
import CartographyDescription.parts.forms.ExceptionPropertiesEditionPartForm;
import CartographyDescription.parts.forms.Interface_PropertiesEditionPartForm;
import CartographyDescription.parts.forms.LayerPropertiesEditionPartForm;
import CartographyDescription.parts.forms.MethodPropertiesEditionPartForm;
import CartographyDescription.parts.forms.ModulePropertiesEditionPartForm;
import CartographyDescription.parts.forms.PatternPropertiesEditionPartForm;
import CartographyDescription.parts.forms.PersistenceManagerPropertiesEditionPartForm;
import CartographyDescription.parts.forms.ServicePropertiesEditionPartForm;
import CartographyDescription.parts.forms.StaticMetricsPropertiesEditionPartForm;
import CartographyDescription.parts.forms.UIPropertiesEditionPartForm;
import CartographyDescription.parts.forms.UnitTestPropertiesEditionPartForm;
import CartographyDescription.parts.forms.VarTypePropertiesEditionPartForm;
import CartographyDescription.parts.forms.VariablePropertiesEditionPartForm;

import CartographyDescription.parts.impl.AnnotatedObjectPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.AnnotationParameterPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.AnnotationPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.ApplicationPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.AttributePropertiesEditionPartImpl;
import CartographyDescription.parts.impl.BussinessPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.CartographyElementPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.Class_PropertiesEditionPartImpl;
import CartographyDescription.parts.impl.ConstructorPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.ElementRelationPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.EntityPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.EnumLiteralPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.EnumLiteralvaluePropertiesEditionPartImpl;
import CartographyDescription.parts.impl.EnumerationPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.ExceptionPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.Interface_PropertiesEditionPartImpl;
import CartographyDescription.parts.impl.LayerPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.MethodPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.ModulePropertiesEditionPartImpl;
import CartographyDescription.parts.impl.PatternPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.PersistenceManagerPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.ServicePropertiesEditionPartImpl;
import CartographyDescription.parts.impl.StaticMetricsPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.UIPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.UnitTestPropertiesEditionPartImpl;
import CartographyDescription.parts.impl.VarTypePropertiesEditionPartImpl;
import CartographyDescription.parts.impl.VariablePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class CartographyDescriptionPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == CartographyDescriptionViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == CartographyDescriptionViewsRepository.Application.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new ApplicationPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new ApplicationPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Module.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new ModulePropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new ModulePropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Pattern.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new PatternPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new PatternPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Entity.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new EntityPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new EntityPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Bussiness.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new BussinessPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new BussinessPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.UI.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new UIPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new UIPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Class_.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new Class_PropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new Class_PropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Layer.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new LayerPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new LayerPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Attribute.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new AttributePropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new AttributePropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Service.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new ServicePropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new ServicePropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Method.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new MethodPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new MethodPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Annotation.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new AnnotationPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new AnnotationPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Variable.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new VariablePropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new VariablePropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Interface_.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new Interface_PropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new Interface_PropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.ElementRelation.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new ElementRelationPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new ElementRelationPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.UnitTest.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new UnitTestPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new UnitTestPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.VarType.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new VarTypePropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new VarTypePropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.StaticMetrics.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new StaticMetricsPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new StaticMetricsPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.AnnotatedObject.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new AnnotatedObjectPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new AnnotatedObjectPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.CartographyElement.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new CartographyElementPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new CartographyElementPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.PersistenceManager.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new PersistenceManagerPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new PersistenceManagerPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.AnnotationParameter.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new AnnotationParameterPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new AnnotationParameterPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Exception.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new ExceptionPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new ExceptionPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Enumeration.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new EnumerationPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new EnumerationPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.EnumLiteral.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new EnumLiteralPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new EnumLiteralPropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.EnumLiteralvalue.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new EnumLiteralvaluePropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new EnumLiteralvaluePropertiesEditionPartForm(component);
		}
		if (key == CartographyDescriptionViewsRepository.Constructor.class) {
			if (kind == CartographyDescriptionViewsRepository.SWT_KIND)
				return new ConstructorPropertiesEditionPartImpl(component);
			if (kind == CartographyDescriptionViewsRepository.FORM_KIND)
				return new ConstructorPropertiesEditionPartForm(component);
		}
		return null;
	}

}
