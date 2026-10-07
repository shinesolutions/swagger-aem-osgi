//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_translation_core_impl_translation_manager_impl_properties.g.dart';

/// ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
///
/// Properties:
/// * [defaultConnectorName] 
/// * [defaultCategory] 
@BuiltValue()
abstract class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties implements Built<ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties, ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'defaultConnectorName')
  ConfigNodePropertyString? get defaultConnectorName;

  @BuiltValueField(wireName: r'defaultCategory')
  ConfigNodePropertyString? get defaultCategory;

  ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties._();

  factory ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties([void updates(ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder b)]) = _$ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties> get serializer => _$ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesSerializer();
}

class _$ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties, _$ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.defaultConnectorName != null) {
      yield r'defaultConnectorName';
      yield serializers.serialize(
        object.defaultConnectorName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultCategory != null) {
      yield r'defaultCategory';
      yield serializers.serialize(
        object.defaultCategory,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'defaultConnectorName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultConnectorName.replace(valueDes);
          break;
        case r'defaultCategory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultCategory.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesBuilder();
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

