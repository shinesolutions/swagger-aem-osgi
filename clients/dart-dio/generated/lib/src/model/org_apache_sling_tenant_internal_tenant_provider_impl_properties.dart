//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_tenant_internal_tenant_provider_impl_properties.g.dart';

/// OrgApacheSlingTenantInternalTenantProviderImplProperties
///
/// Properties:
/// * [tenantPeriodRoot] 
/// * [tenantPeriodPathPeriodMatcher] 
@BuiltValue()
abstract class OrgApacheSlingTenantInternalTenantProviderImplProperties implements Built<OrgApacheSlingTenantInternalTenantProviderImplProperties, OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'tenant.root')
  ConfigNodePropertyString? get tenantPeriodRoot;

  @BuiltValueField(wireName: r'tenant.path.matcher')
  ConfigNodePropertyArray? get tenantPeriodPathPeriodMatcher;

  OrgApacheSlingTenantInternalTenantProviderImplProperties._();

  factory OrgApacheSlingTenantInternalTenantProviderImplProperties([void updates(OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder b)]) = _$OrgApacheSlingTenantInternalTenantProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingTenantInternalTenantProviderImplProperties> get serializer => _$OrgApacheSlingTenantInternalTenantProviderImplPropertiesSerializer();
}

class _$OrgApacheSlingTenantInternalTenantProviderImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingTenantInternalTenantProviderImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingTenantInternalTenantProviderImplProperties, _$OrgApacheSlingTenantInternalTenantProviderImplProperties];

  @override
  final String wireName = r'OrgApacheSlingTenantInternalTenantProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingTenantInternalTenantProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.tenantPeriodRoot != null) {
      yield r'tenant.root';
      yield serializers.serialize(
        object.tenantPeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tenantPeriodPathPeriodMatcher != null) {
      yield r'tenant.path.matcher';
      yield serializers.serialize(
        object.tenantPeriodPathPeriodMatcher,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingTenantInternalTenantProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'tenant.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tenantPeriodRoot.replace(valueDes);
          break;
        case r'tenant.path.matcher':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.tenantPeriodPathPeriodMatcher.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingTenantInternalTenantProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder();
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

