//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_csrf_impl_csrf_servlet_properties.g.dart';

/// ComAdobeGraniteCsrfImplCSRFServletProperties
///
/// Properties:
/// * [csrfPeriodTokenPeriodExpiresPeriodIn] 
/// * [slingPeriodAuthPeriodRequirements] 
@BuiltValue()
abstract class ComAdobeGraniteCsrfImplCSRFServletProperties implements Built<ComAdobeGraniteCsrfImplCSRFServletProperties, ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'csrf.token.expires.in')
  ConfigNodePropertyInteger? get csrfPeriodTokenPeriodExpiresPeriodIn;

  @BuiltValueField(wireName: r'sling.auth.requirements')
  ConfigNodePropertyString? get slingPeriodAuthPeriodRequirements;

  ComAdobeGraniteCsrfImplCSRFServletProperties._();

  factory ComAdobeGraniteCsrfImplCSRFServletProperties([void updates(ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder b)]) = _$ComAdobeGraniteCsrfImplCSRFServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteCsrfImplCSRFServletProperties> get serializer => _$ComAdobeGraniteCsrfImplCSRFServletPropertiesSerializer();
}

class _$ComAdobeGraniteCsrfImplCSRFServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteCsrfImplCSRFServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteCsrfImplCSRFServletProperties, _$ComAdobeGraniteCsrfImplCSRFServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteCsrfImplCSRFServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteCsrfImplCSRFServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.csrfPeriodTokenPeriodExpiresPeriodIn != null) {
      yield r'csrf.token.expires.in';
      yield serializers.serialize(
        object.csrfPeriodTokenPeriodExpiresPeriodIn,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.slingPeriodAuthPeriodRequirements != null) {
      yield r'sling.auth.requirements';
      yield serializers.serialize(
        object.slingPeriodAuthPeriodRequirements,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteCsrfImplCSRFServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'csrf.token.expires.in':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.csrfPeriodTokenPeriodExpiresPeriodIn.replace(valueDes);
          break;
        case r'sling.auth.requirements':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodAuthPeriodRequirements.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteCsrfImplCSRFServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteCsrfImplCSRFServletPropertiesBuilder();
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

