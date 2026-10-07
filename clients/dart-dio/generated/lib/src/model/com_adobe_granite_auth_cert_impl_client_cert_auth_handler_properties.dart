//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties.g.dart';

/// ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
///
/// Properties:
/// * [path] 
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties implements Built<ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties, ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties._();

  factory ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties([void updates(ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder b)]) = _$ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties> get serializer => _$ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesSerializer();
}

class _$ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties, _$ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder();
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

