//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties.g.dart';

/// OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
///
/// Properties:
/// * [logPeriodStacktracePeriodOnclose] 
@BuiltValue()
abstract class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties implements Built<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'log.stacktrace.onclose')
  ConfigNodePropertyBoolean? get logPeriodStacktracePeriodOnclose;

  OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties._();

  factory OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties([void updates(OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder b)]) = _$OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties> get serializer => _$OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesSerializer();
}

class _$OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties, _$OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties];

  @override
  final String wireName = r'OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.logPeriodStacktracePeriodOnclose != null) {
      yield r'log.stacktrace.onclose';
      yield serializers.serialize(
        object.logPeriodStacktracePeriodOnclose,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'log.stacktrace.onclose':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.logPeriodStacktracePeriodOnclose.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder();
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

