//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties.g.dart';

/// ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
///
/// Properties:
/// * [pseudoPeriodPatterns] 
@BuiltValue()
abstract class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties implements Built<ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties, ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder> {
  @BuiltValueField(wireName: r'pseudo.patterns')
  ConfigNodePropertyArray? get pseudoPeriodPatterns;

  ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties._();

  factory ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties([void updates(ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder b)]) = _$ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties> get serializer => _$ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesSerializer();
}

class _$ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties, _$ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties];

  @override
  final String wireName = r'ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pseudoPeriodPatterns != null) {
      yield r'pseudo.patterns';
      yield serializers.serialize(
        object.pseudoPeriodPatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pseudo.patterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.pseudoPeriodPatterns.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder();
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

