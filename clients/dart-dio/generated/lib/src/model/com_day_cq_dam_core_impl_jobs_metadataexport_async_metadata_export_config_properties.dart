//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config_properties.g.dart';

/// ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties
///
/// Properties:
/// * [operation] 
/// * [emailEnabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties implements Built<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'operation')
  ConfigNodePropertyString? get operation;

  @BuiltValueField(wireName: r'emailEnabled')
  ConfigNodePropertyBoolean? get emailEnabled;

  ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties._();

  factory ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties([void updates(ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder b)]) = _$ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties> get serializer => _$ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesSerializer();
}

class _$ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties, _$ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.operation != null) {
      yield r'operation';
      yield serializers.serialize(
        object.operation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailEnabled != null) {
      yield r'emailEnabled';
      yield serializers.serialize(
        object.emailEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.operation.replace(valueDes);
          break;
        case r'emailEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.emailEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder();
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

