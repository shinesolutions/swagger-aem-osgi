//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_account_impl_account_management_servlet_properties.g.dart';

/// ComAdobeCqAccountImplAccountManagementServletProperties
///
/// Properties:
/// * [cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail] 
/// * [cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail] 
@BuiltValue()
abstract class ComAdobeCqAccountImplAccountManagementServletProperties implements Built<ComAdobeCqAccountImplAccountManagementServletProperties, ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.accountmanager.config.informnewaccount.mail')
  ConfigNodePropertyString? get cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail;

  @BuiltValueField(wireName: r'cq.accountmanager.config.informnewpwd.mail')
  ConfigNodePropertyString? get cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail;

  ComAdobeCqAccountImplAccountManagementServletProperties._();

  factory ComAdobeCqAccountImplAccountManagementServletProperties([void updates(ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder b)]) = _$ComAdobeCqAccountImplAccountManagementServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqAccountImplAccountManagementServletProperties> get serializer => _$ComAdobeCqAccountImplAccountManagementServletPropertiesSerializer();
}

class _$ComAdobeCqAccountImplAccountManagementServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqAccountImplAccountManagementServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqAccountImplAccountManagementServletProperties, _$ComAdobeCqAccountImplAccountManagementServletProperties];

  @override
  final String wireName = r'ComAdobeCqAccountImplAccountManagementServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqAccountImplAccountManagementServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail != null) {
      yield r'cq.accountmanager.config.informnewaccount.mail';
      yield serializers.serialize(
        object.cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail != null) {
      yield r'cq.accountmanager.config.informnewpwd.mail';
      yield serializers.serialize(
        object.cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqAccountImplAccountManagementServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.accountmanager.config.informnewaccount.mail':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail.replace(valueDes);
          break;
        case r'cq.accountmanager.config.informnewpwd.mail':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqAccountImplAccountManagementServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder();
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

