//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_repository_hc_impl_default_logins_health_check_properties.g.dart';

/// ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [accountPeriodLogins] 
/// * [consolePeriodLogins] 
@BuiltValue()
abstract class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties implements Built<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'account.logins')
  ConfigNodePropertyArray? get accountPeriodLogins;

  @BuiltValueField(wireName: r'console.logins')
  ConfigNodePropertyArray? get consolePeriodLogins;

  ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties._();

  factory ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties([void updates(ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties> get serializer => _$ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties, _$ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.accountPeriodLogins != null) {
      yield r'account.logins';
      yield serializers.serialize(
        object.accountPeriodLogins,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.consolePeriodLogins != null) {
      yield r'console.logins';
      yield serializers.serialize(
        object.consolePeriodLogins,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'account.logins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.accountPeriodLogins.replace(valueDes);
          break;
        case r'console.logins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.consolePeriodLogins.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder();
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

