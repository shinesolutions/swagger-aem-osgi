//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties.g.dart';

/// ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
///
/// Properties:
/// * [createPreviewEnabled] 
/// * [updatePreviewEnabled] 
/// * [queueSize] 
/// * [folderPreviewRenditionRegex] 
@BuiltValue()
abstract class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties implements Built<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'createPreviewEnabled')
  ConfigNodePropertyBoolean? get createPreviewEnabled;

  @BuiltValueField(wireName: r'updatePreviewEnabled')
  ConfigNodePropertyBoolean? get updatePreviewEnabled;

  @BuiltValueField(wireName: r'queueSize')
  ConfigNodePropertyInteger? get queueSize;

  @BuiltValueField(wireName: r'folderPreviewRenditionRegex')
  ConfigNodePropertyString? get folderPreviewRenditionRegex;

  ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties._();

  factory ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties([void updates(ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder b)]) = _$ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties> get serializer => _$ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesSerializer();
}

class _$ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties, _$ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.createPreviewEnabled != null) {
      yield r'createPreviewEnabled';
      yield serializers.serialize(
        object.createPreviewEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.updatePreviewEnabled != null) {
      yield r'updatePreviewEnabled';
      yield serializers.serialize(
        object.updatePreviewEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.queueSize != null) {
      yield r'queueSize';
      yield serializers.serialize(
        object.queueSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.folderPreviewRenditionRegex != null) {
      yield r'folderPreviewRenditionRegex';
      yield serializers.serialize(
        object.folderPreviewRenditionRegex,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'createPreviewEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.createPreviewEnabled.replace(valueDes);
          break;
        case r'updatePreviewEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.updatePreviewEnabled.replace(valueDes);
          break;
        case r'queueSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queueSize.replace(valueDes);
          break;
        case r'folderPreviewRenditionRegex':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.folderPreviewRenditionRegex.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder();
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

