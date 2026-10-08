//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_i18n_impl_preferences_locale_resolver_service_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_i18n_impl_preferences_locale_resolver_service_info.g.dart';

/// ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo implements Built<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo, ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties? get properties;

  ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo._();

  factory ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo([void updates(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder b)]) = _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo> get serializer => _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoSerializer();
}

class _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo, _$ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo];

  @override
  final String wireName = r'ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties),
          ) as ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder();
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

