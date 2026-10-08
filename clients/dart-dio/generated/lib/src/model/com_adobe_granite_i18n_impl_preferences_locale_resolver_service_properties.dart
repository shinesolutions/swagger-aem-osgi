//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties.g.dart';

/// ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties
///
/// Properties:
/// * [securityPeriodPreferencesPeriodName] 
@BuiltValue()
abstract class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties implements Built<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties, ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'security.preferences.name')
  ConfigNodePropertyString? get securityPeriodPreferencesPeriodName;

  ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties._();

  factory ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties([void updates(ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder b)]) = _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties> get serializer => _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesSerializer();
}

class _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties, _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties];

  @override
  final String wireName = r'ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.securityPeriodPreferencesPeriodName != null) {
      yield r'security.preferences.name';
      yield serializers.serialize(
        object.securityPeriodPreferencesPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'security.preferences.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.securityPeriodPreferencesPeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesBuilder();
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

