//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties.g.dart';

/// ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties
///
/// Properties:
/// * [brightedgePeriodUrl] 
@BuiltValue()
abstract class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties implements Built<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties, ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'brightedge.url')
  ConfigNodePropertyString? get brightedgePeriodUrl;

  ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties._();

  factory ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties([void updates(ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder b)]) = _$ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties> get serializer => _$ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesSerializer();
}

class _$ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties, _$ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties];

  @override
  final String wireName = r'ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.brightedgePeriodUrl != null) {
      yield r'brightedge.url';
      yield serializers.serialize(
        object.brightedgePeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'brightedge.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.brightedgePeriodUrl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder();
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

