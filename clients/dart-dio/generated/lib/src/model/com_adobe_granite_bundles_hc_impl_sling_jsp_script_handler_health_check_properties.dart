//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check_properties.g.dart';

/// ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties implements Built<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties, ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties._();

  factory ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties([void updates(ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties> get serializer => _$ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties, _$ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesBuilder();
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

