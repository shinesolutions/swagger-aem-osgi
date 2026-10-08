//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties.g.dart';

/// ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
///
/// Properties:
/// * [graniteColonData] 
@BuiltValue()
abstract class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties implements Built<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'granite:data')
  ConfigNodePropertyArray? get graniteColonData;

  ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties._();

  factory ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties([void updates(ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties> get serializer => _$ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties, _$ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.graniteColonData != null) {
      yield r'granite:data';
      yield serializers.serialize(
        object.graniteColonData,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'granite:data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.graniteColonData.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesBuilder();
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

