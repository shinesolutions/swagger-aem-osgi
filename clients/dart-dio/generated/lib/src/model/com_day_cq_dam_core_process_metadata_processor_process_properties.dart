//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_process_metadata_processor_process_properties.g.dart';

/// ComDayCqDamCoreProcessMetadataProcessorProcessProperties
///
/// Properties:
/// * [processPeriodLabel] 
/// * [cqPeriodDamPeriodEnablePeriodSha1] 
/// * [cqPeriodDamPeriodMetadataPeriodXssprotectedPeriodProperties] 
@BuiltValue()
abstract class ComDayCqDamCoreProcessMetadataProcessorProcessProperties implements Built<ComDayCqDamCoreProcessMetadataProcessorProcessProperties, ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder> {
  @BuiltValueField(wireName: r'process.label')
  ConfigNodePropertyString? get processPeriodLabel;

  @BuiltValueField(wireName: r'cq.dam.enable.sha1')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodEnablePeriodSha1;

  @BuiltValueField(wireName: r'cq.dam.metadata.xssprotected.properties')
  ConfigNodePropertyArray? get cqPeriodDamPeriodMetadataPeriodXssprotectedPeriodProperties;

  ComDayCqDamCoreProcessMetadataProcessorProcessProperties._();

  factory ComDayCqDamCoreProcessMetadataProcessorProcessProperties([void updates(ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder b)]) = _$ComDayCqDamCoreProcessMetadataProcessorProcessProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreProcessMetadataProcessorProcessProperties> get serializer => _$ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesSerializer();
}

class _$ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreProcessMetadataProcessorProcessProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreProcessMetadataProcessorProcessProperties, _$ComDayCqDamCoreProcessMetadataProcessorProcessProperties];

  @override
  final String wireName = r'ComDayCqDamCoreProcessMetadataProcessorProcessProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreProcessMetadataProcessorProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.processPeriodLabel != null) {
      yield r'process.label';
      yield serializers.serialize(
        object.processPeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodDamPeriodEnablePeriodSha1 != null) {
      yield r'cq.dam.enable.sha1';
      yield serializers.serialize(
        object.cqPeriodDamPeriodEnablePeriodSha1,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodDamPeriodMetadataPeriodXssprotectedPeriodProperties != null) {
      yield r'cq.dam.metadata.xssprotected.properties';
      yield serializers.serialize(
        object.cqPeriodDamPeriodMetadataPeriodXssprotectedPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreProcessMetadataProcessorProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'process.label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.processPeriodLabel.replace(valueDes);
          break;
        case r'cq.dam.enable.sha1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodEnablePeriodSha1.replace(valueDes);
          break;
        case r'cq.dam.metadata.xssprotected.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodMetadataPeriodXssprotectedPeriodProperties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreProcessMetadataProcessorProcessProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder();
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

