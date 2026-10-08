//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_unzip_unzip_config_properties.g.dart';

/// ComDayCqDamCoreImplUnzipUnzipConfigProperties
///
/// Properties:
/// * [cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize] 
/// * [cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding] 
@BuiltValue()
abstract class ComDayCqDamCoreImplUnzipUnzipConfigProperties implements Built<ComDayCqDamCoreImplUnzipUnzipConfigProperties, ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.config.unzip.maxuncompressedsize')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize;

  @BuiltValueField(wireName: r'cq.dam.config.unzip.encoding')
  ConfigNodePropertyString? get cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding;

  ComDayCqDamCoreImplUnzipUnzipConfigProperties._();

  factory ComDayCqDamCoreImplUnzipUnzipConfigProperties([void updates(ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder b)]) = _$ComDayCqDamCoreImplUnzipUnzipConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplUnzipUnzipConfigProperties> get serializer => _$ComDayCqDamCoreImplUnzipUnzipConfigPropertiesSerializer();
}

class _$ComDayCqDamCoreImplUnzipUnzipConfigPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplUnzipUnzipConfigProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplUnzipUnzipConfigProperties, _$ComDayCqDamCoreImplUnzipUnzipConfigProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplUnzipUnzipConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplUnzipUnzipConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize != null) {
      yield r'cq.dam.config.unzip.maxuncompressedsize';
      yield serializers.serialize(
        object.cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding != null) {
      yield r'cq.dam.config.unzip.encoding';
      yield serializers.serialize(
        object.cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplUnzipUnzipConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.config.unzip.maxuncompressedsize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize.replace(valueDes);
          break;
        case r'cq.dam.config.unzip.encoding':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplUnzipUnzipConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplUnzipUnzipConfigPropertiesBuilder();
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

