//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_audit_purge_pages_properties.g.dart';

/// ComAdobeCqAuditPurgePagesProperties
///
/// Properties:
/// * [auditlogPeriodRulePeriodName] 
/// * [auditlogPeriodRulePeriodContentpath] 
/// * [auditlogPeriodRulePeriodMinimumage] 
/// * [auditlogPeriodRulePeriodTypes] 
@BuiltValue()
abstract class ComAdobeCqAuditPurgePagesProperties implements Built<ComAdobeCqAuditPurgePagesProperties, ComAdobeCqAuditPurgePagesPropertiesBuilder> {
  @BuiltValueField(wireName: r'auditlog.rule.name')
  ConfigNodePropertyString? get auditlogPeriodRulePeriodName;

  @BuiltValueField(wireName: r'auditlog.rule.contentpath')
  ConfigNodePropertyString? get auditlogPeriodRulePeriodContentpath;

  @BuiltValueField(wireName: r'auditlog.rule.minimumage')
  ConfigNodePropertyInteger? get auditlogPeriodRulePeriodMinimumage;

  @BuiltValueField(wireName: r'auditlog.rule.types')
  ConfigNodePropertyDropDown? get auditlogPeriodRulePeriodTypes;

  ComAdobeCqAuditPurgePagesProperties._();

  factory ComAdobeCqAuditPurgePagesProperties([void updates(ComAdobeCqAuditPurgePagesPropertiesBuilder b)]) = _$ComAdobeCqAuditPurgePagesProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqAuditPurgePagesPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqAuditPurgePagesProperties> get serializer => _$ComAdobeCqAuditPurgePagesPropertiesSerializer();
}

class _$ComAdobeCqAuditPurgePagesPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqAuditPurgePagesProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqAuditPurgePagesProperties, _$ComAdobeCqAuditPurgePagesProperties];

  @override
  final String wireName = r'ComAdobeCqAuditPurgePagesProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqAuditPurgePagesProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.auditlogPeriodRulePeriodName != null) {
      yield r'auditlog.rule.name';
      yield serializers.serialize(
        object.auditlogPeriodRulePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.auditlogPeriodRulePeriodContentpath != null) {
      yield r'auditlog.rule.contentpath';
      yield serializers.serialize(
        object.auditlogPeriodRulePeriodContentpath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.auditlogPeriodRulePeriodMinimumage != null) {
      yield r'auditlog.rule.minimumage';
      yield serializers.serialize(
        object.auditlogPeriodRulePeriodMinimumage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.auditlogPeriodRulePeriodTypes != null) {
      yield r'auditlog.rule.types';
      yield serializers.serialize(
        object.auditlogPeriodRulePeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqAuditPurgePagesProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqAuditPurgePagesPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auditlog.rule.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.auditlogPeriodRulePeriodName.replace(valueDes);
          break;
        case r'auditlog.rule.contentpath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.auditlogPeriodRulePeriodContentpath.replace(valueDes);
          break;
        case r'auditlog.rule.minimumage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.auditlogPeriodRulePeriodMinimumage.replace(valueDes);
          break;
        case r'auditlog.rule.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.auditlogPeriodRulePeriodTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqAuditPurgePagesProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqAuditPurgePagesPropertiesBuilder();
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

