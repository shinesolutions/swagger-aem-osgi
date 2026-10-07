//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl_properties.g.dart';

/// ComAdobeCqDamDmProcessImagePTiffManagerImplProperties
///
/// Properties:
/// * [maxMemory] 
@BuiltValue()
abstract class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties implements Built<ComAdobeCqDamDmProcessImagePTiffManagerImplProperties, ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'maxMemory')
  ConfigNodePropertyInteger? get maxMemory;

  ComAdobeCqDamDmProcessImagePTiffManagerImplProperties._();

  factory ComAdobeCqDamDmProcessImagePTiffManagerImplProperties([void updates(ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder b)]) = _$ComAdobeCqDamDmProcessImagePTiffManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamDmProcessImagePTiffManagerImplProperties> get serializer => _$ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesSerializer();
}

class _$ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamDmProcessImagePTiffManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamDmProcessImagePTiffManagerImplProperties, _$ComAdobeCqDamDmProcessImagePTiffManagerImplProperties];

  @override
  final String wireName = r'ComAdobeCqDamDmProcessImagePTiffManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxMemory != null) {
      yield r'maxMemory';
      yield serializers.serialize(
        object.maxMemory,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'maxMemory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxMemory.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamDmProcessImagePTiffManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder();
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

