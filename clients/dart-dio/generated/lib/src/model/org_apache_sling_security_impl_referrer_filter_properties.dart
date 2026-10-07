//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_security_impl_referrer_filter_properties.g.dart';

/// OrgApacheSlingSecurityImplReferrerFilterProperties
///
/// Properties:
/// * [allowPeriodEmpty] 
/// * [allowPeriodHosts] 
/// * [allowPeriodHostsPeriodRegexp] 
/// * [filterPeriodMethods] 
/// * [excludePeriodAgentsPeriodRegexp] 
@BuiltValue()
abstract class OrgApacheSlingSecurityImplReferrerFilterProperties implements Built<OrgApacheSlingSecurityImplReferrerFilterProperties, OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'allow.empty')
  ConfigNodePropertyBoolean? get allowPeriodEmpty;

  @BuiltValueField(wireName: r'allow.hosts')
  ConfigNodePropertyArray? get allowPeriodHosts;

  @BuiltValueField(wireName: r'allow.hosts.regexp')
  ConfigNodePropertyArray? get allowPeriodHostsPeriodRegexp;

  @BuiltValueField(wireName: r'filter.methods')
  ConfigNodePropertyArray? get filterPeriodMethods;

  @BuiltValueField(wireName: r'exclude.agents.regexp')
  ConfigNodePropertyArray? get excludePeriodAgentsPeriodRegexp;

  OrgApacheSlingSecurityImplReferrerFilterProperties._();

  factory OrgApacheSlingSecurityImplReferrerFilterProperties([void updates(OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder b)]) = _$OrgApacheSlingSecurityImplReferrerFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingSecurityImplReferrerFilterProperties> get serializer => _$OrgApacheSlingSecurityImplReferrerFilterPropertiesSerializer();
}

class _$OrgApacheSlingSecurityImplReferrerFilterPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingSecurityImplReferrerFilterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingSecurityImplReferrerFilterProperties, _$OrgApacheSlingSecurityImplReferrerFilterProperties];

  @override
  final String wireName = r'OrgApacheSlingSecurityImplReferrerFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingSecurityImplReferrerFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.allowPeriodEmpty != null) {
      yield r'allow.empty';
      yield serializers.serialize(
        object.allowPeriodEmpty,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.allowPeriodHosts != null) {
      yield r'allow.hosts';
      yield serializers.serialize(
        object.allowPeriodHosts,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.allowPeriodHostsPeriodRegexp != null) {
      yield r'allow.hosts.regexp';
      yield serializers.serialize(
        object.allowPeriodHostsPeriodRegexp,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.filterPeriodMethods != null) {
      yield r'filter.methods';
      yield serializers.serialize(
        object.filterPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.excludePeriodAgentsPeriodRegexp != null) {
      yield r'exclude.agents.regexp';
      yield serializers.serialize(
        object.excludePeriodAgentsPeriodRegexp,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingSecurityImplReferrerFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'allow.empty':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.allowPeriodEmpty.replace(valueDes);
          break;
        case r'allow.hosts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.allowPeriodHosts.replace(valueDes);
          break;
        case r'allow.hosts.regexp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.allowPeriodHostsPeriodRegexp.replace(valueDes);
          break;
        case r'filter.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.filterPeriodMethods.replace(valueDes);
          break;
        case r'exclude.agents.regexp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.excludePeriodAgentsPeriodRegexp.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingSecurityImplReferrerFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder();
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

