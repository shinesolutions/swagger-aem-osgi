//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_ims_properties.g.dart';

/// ComAdobeGraniteAuthImsProperties
///
/// Properties:
/// * [configid] 
/// * [scope] 
@BuiltValue()
abstract class ComAdobeGraniteAuthImsProperties implements Built<ComAdobeGraniteAuthImsProperties, ComAdobeGraniteAuthImsPropertiesBuilder> {
  @BuiltValueField(wireName: r'configid')
  ConfigNodePropertyString? get configid;

  @BuiltValueField(wireName: r'scope')
  ConfigNodePropertyString? get scope;

  ComAdobeGraniteAuthImsProperties._();

  factory ComAdobeGraniteAuthImsProperties([void updates(ComAdobeGraniteAuthImsPropertiesBuilder b)]) = _$ComAdobeGraniteAuthImsProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthImsPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthImsProperties> get serializer => _$ComAdobeGraniteAuthImsPropertiesSerializer();
}

class _$ComAdobeGraniteAuthImsPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthImsProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthImsProperties, _$ComAdobeGraniteAuthImsProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthImsProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthImsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.configid != null) {
      yield r'configid';
      yield serializers.serialize(
        object.configid,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scope != null) {
      yield r'scope';
      yield serializers.serialize(
        object.scope,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthImsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthImsPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'configid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.configid.replace(valueDes);
          break;
        case r'scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scope.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthImsProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthImsPropertiesBuilder();
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

