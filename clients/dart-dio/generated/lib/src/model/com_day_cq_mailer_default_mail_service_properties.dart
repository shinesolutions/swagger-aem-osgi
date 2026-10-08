//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mailer_default_mail_service_properties.g.dart';

/// ComDayCqMailerDefaultMailServiceProperties
///
/// Properties:
/// * [smtpPeriodHost] 
/// * [smtpPeriodPort] 
/// * [smtpPeriodUser] 
/// * [smtpPeriodPassword] 
/// * [fromPeriodAddress] 
/// * [smtpPeriodSsl] 
/// * [smtpPeriodStarttls] 
/// * [debugPeriodEmail] 
@BuiltValue()
abstract class ComDayCqMailerDefaultMailServiceProperties implements Built<ComDayCqMailerDefaultMailServiceProperties, ComDayCqMailerDefaultMailServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'smtp.host')
  ConfigNodePropertyString? get smtpPeriodHost;

  @BuiltValueField(wireName: r'smtp.port')
  ConfigNodePropertyInteger? get smtpPeriodPort;

  @BuiltValueField(wireName: r'smtp.user')
  ConfigNodePropertyString? get smtpPeriodUser;

  @BuiltValueField(wireName: r'smtp.password')
  ConfigNodePropertyString? get smtpPeriodPassword;

  @BuiltValueField(wireName: r'from.address')
  ConfigNodePropertyString? get fromPeriodAddress;

  @BuiltValueField(wireName: r'smtp.ssl')
  ConfigNodePropertyBoolean? get smtpPeriodSsl;

  @BuiltValueField(wireName: r'smtp.starttls')
  ConfigNodePropertyBoolean? get smtpPeriodStarttls;

  @BuiltValueField(wireName: r'debug.email')
  ConfigNodePropertyBoolean? get debugPeriodEmail;

  ComDayCqMailerDefaultMailServiceProperties._();

  factory ComDayCqMailerDefaultMailServiceProperties([void updates(ComDayCqMailerDefaultMailServicePropertiesBuilder b)]) = _$ComDayCqMailerDefaultMailServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMailerDefaultMailServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMailerDefaultMailServiceProperties> get serializer => _$ComDayCqMailerDefaultMailServicePropertiesSerializer();
}

class _$ComDayCqMailerDefaultMailServicePropertiesSerializer implements PrimitiveSerializer<ComDayCqMailerDefaultMailServiceProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMailerDefaultMailServiceProperties, _$ComDayCqMailerDefaultMailServiceProperties];

  @override
  final String wireName = r'ComDayCqMailerDefaultMailServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMailerDefaultMailServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.smtpPeriodHost != null) {
      yield r'smtp.host';
      yield serializers.serialize(
        object.smtpPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.smtpPeriodPort != null) {
      yield r'smtp.port';
      yield serializers.serialize(
        object.smtpPeriodPort,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.smtpPeriodUser != null) {
      yield r'smtp.user';
      yield serializers.serialize(
        object.smtpPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.smtpPeriodPassword != null) {
      yield r'smtp.password';
      yield serializers.serialize(
        object.smtpPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fromPeriodAddress != null) {
      yield r'from.address';
      yield serializers.serialize(
        object.fromPeriodAddress,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.smtpPeriodSsl != null) {
      yield r'smtp.ssl';
      yield serializers.serialize(
        object.smtpPeriodSsl,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.smtpPeriodStarttls != null) {
      yield r'smtp.starttls';
      yield serializers.serialize(
        object.smtpPeriodStarttls,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.debugPeriodEmail != null) {
      yield r'debug.email';
      yield serializers.serialize(
        object.debugPeriodEmail,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMailerDefaultMailServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMailerDefaultMailServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'smtp.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.smtpPeriodHost.replace(valueDes);
          break;
        case r'smtp.port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.smtpPeriodPort.replace(valueDes);
          break;
        case r'smtp.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.smtpPeriodUser.replace(valueDes);
          break;
        case r'smtp.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.smtpPeriodPassword.replace(valueDes);
          break;
        case r'from.address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.fromPeriodAddress.replace(valueDes);
          break;
        case r'smtp.ssl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.smtpPeriodSsl.replace(valueDes);
          break;
        case r'smtp.starttls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.smtpPeriodStarttls.replace(valueDes);
          break;
        case r'debug.email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.debugPeriodEmail.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMailerDefaultMailServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMailerDefaultMailServicePropertiesBuilder();
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

