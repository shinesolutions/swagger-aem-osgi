//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties.g.dart';

/// ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties
///
/// Properties:
/// * [binaryPeriodThreshold] 
@BuiltValue()
abstract class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties implements Built<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties, ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder> {
  @BuiltValueField(wireName: r'binary.threshold')
  ConfigNodePropertyInteger? get binaryPeriodThreshold;

  ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties._();

  factory ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties([void updates(ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder b)]) = _$ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties> get serializer => _$ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesSerializer();
}

class _$ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties, _$ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.binaryPeriodThreshold != null) {
      yield r'binary.threshold';
      yield serializers.serialize(
        object.binaryPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'binary.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.binaryPeriodThreshold.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBuilder();
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

