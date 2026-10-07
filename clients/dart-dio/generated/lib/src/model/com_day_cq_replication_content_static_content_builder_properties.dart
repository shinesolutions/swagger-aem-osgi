//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_content_static_content_builder_properties.g.dart';

/// ComDayCqReplicationContentStaticContentBuilderProperties
///
/// Properties:
/// * [host] 
/// * [port] 
@BuiltValue()
abstract class ComDayCqReplicationContentStaticContentBuilderProperties implements Built<ComDayCqReplicationContentStaticContentBuilderProperties, ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder> {
  @BuiltValueField(wireName: r'host')
  ConfigNodePropertyString? get host;

  @BuiltValueField(wireName: r'port')
  ConfigNodePropertyInteger? get port;

  ComDayCqReplicationContentStaticContentBuilderProperties._();

  factory ComDayCqReplicationContentStaticContentBuilderProperties([void updates(ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder b)]) = _$ComDayCqReplicationContentStaticContentBuilderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationContentStaticContentBuilderProperties> get serializer => _$ComDayCqReplicationContentStaticContentBuilderPropertiesSerializer();
}

class _$ComDayCqReplicationContentStaticContentBuilderPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationContentStaticContentBuilderProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationContentStaticContentBuilderProperties, _$ComDayCqReplicationContentStaticContentBuilderProperties];

  @override
  final String wireName = r'ComDayCqReplicationContentStaticContentBuilderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationContentStaticContentBuilderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.host != null) {
      yield r'host';
      yield serializers.serialize(
        object.host,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.port != null) {
      yield r'port';
      yield serializers.serialize(
        object.port,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationContentStaticContentBuilderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.host.replace(valueDes);
          break;
        case r'port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.port.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationContentStaticContentBuilderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder();
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

