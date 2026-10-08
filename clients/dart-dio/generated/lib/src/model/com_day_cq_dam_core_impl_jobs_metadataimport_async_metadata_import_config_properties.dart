//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties.g.dart';

/// ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
///
/// Properties:
/// * [operation] 
/// * [operationIcon] 
/// * [topicName] 
/// * [emailEnabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties implements Built<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'operation')
  ConfigNodePropertyString? get operation;

  @BuiltValueField(wireName: r'operationIcon')
  ConfigNodePropertyString? get operationIcon;

  @BuiltValueField(wireName: r'topicName')
  ConfigNodePropertyString? get topicName;

  @BuiltValueField(wireName: r'emailEnabled')
  ConfigNodePropertyBoolean? get emailEnabled;

  ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties._();

  factory ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties([void updates(ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder b)]) = _$ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties> get serializer => _$ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesSerializer();
}

class _$ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties, _$ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.operation != null) {
      yield r'operation';
      yield serializers.serialize(
        object.operation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.operationIcon != null) {
      yield r'operationIcon';
      yield serializers.serialize(
        object.operationIcon,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.topicName != null) {
      yield r'topicName';
      yield serializers.serialize(
        object.topicName,
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
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder result,
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
        case r'operationIcon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.operationIcon.replace(valueDes);
          break;
        case r'topicName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.topicName.replace(valueDes);
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
  ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder();
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

