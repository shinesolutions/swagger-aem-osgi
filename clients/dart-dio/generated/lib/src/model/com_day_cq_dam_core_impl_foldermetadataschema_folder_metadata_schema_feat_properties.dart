//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_properties.g.dart';

/// ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties
///
/// Properties:
/// * [isEnabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties implements Built<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder> {
  @BuiltValueField(wireName: r'isEnabled')
  ConfigNodePropertyBoolean? get isEnabled;

  ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties._();

  factory ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties([void updates(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder b)]) = _$ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties> get serializer => _$ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesSerializer();
}

class _$ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties, _$ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isEnabled != null) {
      yield r'isEnabled';
      yield serializers.serialize(
        object.isEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'isEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.isEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesBuilder();
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

