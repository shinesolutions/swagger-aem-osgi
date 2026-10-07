//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties.g.dart';

/// ComDayCqWcmFoundationFormsImplFormChooserServletProperties
///
/// Properties:
/// * [servicePeriodName] 
/// * [slingPeriodServletPeriodResourceTypes] 
/// * [slingPeriodServletPeriodSelectors] 
/// * [slingPeriodServletPeriodMethods] 
/// * [formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire] 
@BuiltValue()
abstract class ComDayCqWcmFoundationFormsImplFormChooserServletProperties implements Built<ComDayCqWcmFoundationFormsImplFormChooserServletProperties, ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.name')
  ConfigNodePropertyString? get servicePeriodName;

  @BuiltValueField(wireName: r'sling.servlet.resourceTypes')
  ConfigNodePropertyString? get slingPeriodServletPeriodResourceTypes;

  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyString? get slingPeriodServletPeriodSelectors;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyArray? get slingPeriodServletPeriodMethods;

  @BuiltValueField(wireName: r'forms.formchooserservlet.advansesearch.require')
  ConfigNodePropertyBoolean? get formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire;

  ComDayCqWcmFoundationFormsImplFormChooserServletProperties._();

  factory ComDayCqWcmFoundationFormsImplFormChooserServletProperties([void updates(ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder b)]) = _$ComDayCqWcmFoundationFormsImplFormChooserServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationFormsImplFormChooserServletProperties> get serializer => _$ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesSerializer();
}

class _$ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationFormsImplFormChooserServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationFormsImplFormChooserServletProperties, _$ComDayCqWcmFoundationFormsImplFormChooserServletProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationFormsImplFormChooserServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplFormChooserServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodName != null) {
      yield r'service.name';
      yield serializers.serialize(
        object.servicePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodResourceTypes != null) {
      yield r'sling.servlet.resourceTypes';
      yield serializers.serialize(
        object.slingPeriodServletPeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodSelectors != null) {
      yield r'sling.servlet.selectors';
      yield serializers.serialize(
        object.slingPeriodServletPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire != null) {
      yield r'forms.formchooserservlet.advansesearch.require';
      yield serializers.serialize(
        object.formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplFormChooserServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.servicePeriodName.replace(valueDes);
          break;
        case r'sling.servlet.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodResourceTypes.replace(valueDes);
          break;
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodSelectors.replace(valueDes);
          break;
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        case r'forms.formchooserservlet.advansesearch.require':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationFormsImplFormChooserServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationFormsImplFormChooserServletPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

