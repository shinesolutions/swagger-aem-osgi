//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_account_api_account_management_service_properties.g.dart';

/// ComAdobeCqAccountApiAccountManagementServiceProperties
///
/// Properties:
/// * [cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod] 
/// * [cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail] 
/// * [cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail] 
@BuiltValue()
abstract class ComAdobeCqAccountApiAccountManagementServiceProperties implements Built<ComAdobeCqAccountApiAccountManagementServiceProperties, ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.accountmanager.token.validity.period')
  ConfigNodePropertyInteger? get cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod;

  @BuiltValueField(wireName: r'cq.accountmanager.config.requestnewaccount.mail')
  ConfigNodePropertyString? get cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail;

  @BuiltValueField(wireName: r'cq.accountmanager.config.requestnewpwd.mail')
  ConfigNodePropertyString? get cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail;

  ComAdobeCqAccountApiAccountManagementServiceProperties._();

  factory ComAdobeCqAccountApiAccountManagementServiceProperties([void updates(ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder b)]) = _$ComAdobeCqAccountApiAccountManagementServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqAccountApiAccountManagementServiceProperties> get serializer => _$ComAdobeCqAccountApiAccountManagementServicePropertiesSerializer();
}

class _$ComAdobeCqAccountApiAccountManagementServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqAccountApiAccountManagementServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqAccountApiAccountManagementServiceProperties, _$ComAdobeCqAccountApiAccountManagementServiceProperties];

  @override
  final String wireName = r'ComAdobeCqAccountApiAccountManagementServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqAccountApiAccountManagementServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod != null) {
      yield r'cq.accountmanager.token.validity.period';
      yield serializers.serialize(
        object.cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail != null) {
      yield r'cq.accountmanager.config.requestnewaccount.mail';
      yield serializers.serialize(
        object.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail != null) {
      yield r'cq.accountmanager.config.requestnewpwd.mail';
      yield serializers.serialize(
        object.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqAccountApiAccountManagementServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.accountmanager.token.validity.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod.replace(valueDes);
          break;
        case r'cq.accountmanager.config.requestnewaccount.mail':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail.replace(valueDes);
          break;
        case r'cq.accountmanager.config.requestnewpwd.mail':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqAccountApiAccountManagementServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder();
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

