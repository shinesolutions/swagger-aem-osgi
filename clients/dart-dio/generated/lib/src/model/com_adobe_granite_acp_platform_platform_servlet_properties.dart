//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_acp_platform_platform_servlet_properties.g.dart';

/// ComAdobeGraniteAcpPlatformPlatformServletProperties
///
/// Properties:
/// * [queryPeriodLimit] 
/// * [filePeriodTypePeriodExtensionPeriodMap] 
@BuiltValue()
abstract class ComAdobeGraniteAcpPlatformPlatformServletProperties implements Built<ComAdobeGraniteAcpPlatformPlatformServletProperties, ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'query.limit')
  ConfigNodePropertyInteger? get queryPeriodLimit;

  @BuiltValueField(wireName: r'file.type.extension.map')
  ConfigNodePropertyArray? get filePeriodTypePeriodExtensionPeriodMap;

  ComAdobeGraniteAcpPlatformPlatformServletProperties._();

  factory ComAdobeGraniteAcpPlatformPlatformServletProperties([void updates(ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder b)]) = _$ComAdobeGraniteAcpPlatformPlatformServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAcpPlatformPlatformServletProperties> get serializer => _$ComAdobeGraniteAcpPlatformPlatformServletPropertiesSerializer();
}

class _$ComAdobeGraniteAcpPlatformPlatformServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAcpPlatformPlatformServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAcpPlatformPlatformServletProperties, _$ComAdobeGraniteAcpPlatformPlatformServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteAcpPlatformPlatformServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAcpPlatformPlatformServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.queryPeriodLimit != null) {
      yield r'query.limit';
      yield serializers.serialize(
        object.queryPeriodLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.filePeriodTypePeriodExtensionPeriodMap != null) {
      yield r'file.type.extension.map';
      yield serializers.serialize(
        object.filePeriodTypePeriodExtensionPeriodMap,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAcpPlatformPlatformServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'query.limit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queryPeriodLimit.replace(valueDes);
          break;
        case r'file.type.extension.map':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.filePeriodTypePeriodExtensionPeriodMap.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAcpPlatformPlatformServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder();
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

