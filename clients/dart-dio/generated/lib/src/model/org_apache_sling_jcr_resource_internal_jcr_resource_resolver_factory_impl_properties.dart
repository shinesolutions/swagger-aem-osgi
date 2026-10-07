//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties.g.dart';

/// OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
///
/// Properties:
/// * [resourcePeriodResolverPeriodSearchpath] 
/// * [resourcePeriodResolverPeriodManglenamespaces] 
/// * [resourcePeriodResolverPeriodAllowDirect] 
/// * [resourcePeriodResolverPeriodRequiredPeriodProviders] 
/// * [resourcePeriodResolverPeriodRequiredPeriodProvidernames] 
/// * [resourcePeriodResolverPeriodVirtual] 
/// * [resourcePeriodResolverPeriodMapping] 
/// * [resourcePeriodResolverPeriodMapPeriodLocation] 
/// * [resourcePeriodResolverPeriodMapPeriodObservation] 
/// * [resourcePeriodResolverPeriodDefaultPeriodVanityPeriodRedirectPeriodStatus] 
/// * [resourcePeriodResolverPeriodEnablePeriodVanitypath] 
/// * [resourcePeriodResolverPeriodVanitypathPeriodMaxEntries] 
/// * [resourcePeriodResolverPeriodVanitypathPeriodMaxEntriesPeriodStartup] 
/// * [resourcePeriodResolverPeriodVanitypathPeriodBloomfilterPeriodMaxBytes] 
/// * [resourcePeriodResolverPeriodOptimizePeriodAliasPeriodResolution] 
/// * [resourcePeriodResolverPeriodVanitypathPeriodWhitelist] 
/// * [resourcePeriodResolverPeriodVanitypathPeriodBlacklist] 
/// * [resourcePeriodResolverPeriodVanityPeriodPrecedence] 
/// * [resourcePeriodResolverPeriodProviderhandlingPeriodParanoid] 
/// * [resourcePeriodResolverPeriodLogPeriodClosing] 
/// * [resourcePeriodResolverPeriodLogPeriodUnclosed] 
@BuiltValue()
abstract class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties implements Built<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties, OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'resource.resolver.searchpath')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodSearchpath;

  @BuiltValueField(wireName: r'resource.resolver.manglenamespaces')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodManglenamespaces;

  @BuiltValueField(wireName: r'resource.resolver.allowDirect')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodAllowDirect;

  @BuiltValueField(wireName: r'resource.resolver.required.providers')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodRequiredPeriodProviders;

  @BuiltValueField(wireName: r'resource.resolver.required.providernames')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodRequiredPeriodProvidernames;

  @BuiltValueField(wireName: r'resource.resolver.virtual')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodVirtual;

  @BuiltValueField(wireName: r'resource.resolver.mapping')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodMapping;

  @BuiltValueField(wireName: r'resource.resolver.map.location')
  ConfigNodePropertyString? get resourcePeriodResolverPeriodMapPeriodLocation;

  @BuiltValueField(wireName: r'resource.resolver.map.observation')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodMapPeriodObservation;

  @BuiltValueField(wireName: r'resource.resolver.default.vanity.redirect.status')
  ConfigNodePropertyInteger? get resourcePeriodResolverPeriodDefaultPeriodVanityPeriodRedirectPeriodStatus;

  @BuiltValueField(wireName: r'resource.resolver.enable.vanitypath')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodEnablePeriodVanitypath;

  @BuiltValueField(wireName: r'resource.resolver.vanitypath.maxEntries')
  ConfigNodePropertyInteger? get resourcePeriodResolverPeriodVanitypathPeriodMaxEntries;

  @BuiltValueField(wireName: r'resource.resolver.vanitypath.maxEntries.startup')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodVanitypathPeriodMaxEntriesPeriodStartup;

  @BuiltValueField(wireName: r'resource.resolver.vanitypath.bloomfilter.maxBytes')
  ConfigNodePropertyInteger? get resourcePeriodResolverPeriodVanitypathPeriodBloomfilterPeriodMaxBytes;

  @BuiltValueField(wireName: r'resource.resolver.optimize.alias.resolution')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodOptimizePeriodAliasPeriodResolution;

  @BuiltValueField(wireName: r'resource.resolver.vanitypath.whitelist')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodVanitypathPeriodWhitelist;

  @BuiltValueField(wireName: r'resource.resolver.vanitypath.blacklist')
  ConfigNodePropertyArray? get resourcePeriodResolverPeriodVanitypathPeriodBlacklist;

  @BuiltValueField(wireName: r'resource.resolver.vanity.precedence')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodVanityPeriodPrecedence;

  @BuiltValueField(wireName: r'resource.resolver.providerhandling.paranoid')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodProviderhandlingPeriodParanoid;

  @BuiltValueField(wireName: r'resource.resolver.log.closing')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodLogPeriodClosing;

  @BuiltValueField(wireName: r'resource.resolver.log.unclosed')
  ConfigNodePropertyBoolean? get resourcePeriodResolverPeriodLogPeriodUnclosed;

  OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties._();

  factory OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties([void updates(OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder b)]) = _$OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties> get serializer => _$OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesSerializer();
}

class _$OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties, _$OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.resourcePeriodResolverPeriodSearchpath != null) {
      yield r'resource.resolver.searchpath';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodSearchpath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodManglenamespaces != null) {
      yield r'resource.resolver.manglenamespaces';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodManglenamespaces,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodAllowDirect != null) {
      yield r'resource.resolver.allowDirect';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodAllowDirect,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodRequiredPeriodProviders != null) {
      yield r'resource.resolver.required.providers';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodRequiredPeriodProviders,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodRequiredPeriodProvidernames != null) {
      yield r'resource.resolver.required.providernames';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodRequiredPeriodProvidernames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodVirtual != null) {
      yield r'resource.resolver.virtual';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodVirtual,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodMapping != null) {
      yield r'resource.resolver.mapping';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodMapPeriodLocation != null) {
      yield r'resource.resolver.map.location';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodMapPeriodLocation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.resourcePeriodResolverPeriodMapPeriodObservation != null) {
      yield r'resource.resolver.map.observation';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodMapPeriodObservation,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodDefaultPeriodVanityPeriodRedirectPeriodStatus != null) {
      yield r'resource.resolver.default.vanity.redirect.status';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodDefaultPeriodVanityPeriodRedirectPeriodStatus,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.resourcePeriodResolverPeriodEnablePeriodVanitypath != null) {
      yield r'resource.resolver.enable.vanitypath';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodEnablePeriodVanitypath,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodVanitypathPeriodMaxEntries != null) {
      yield r'resource.resolver.vanitypath.maxEntries';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodVanitypathPeriodMaxEntries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.resourcePeriodResolverPeriodVanitypathPeriodMaxEntriesPeriodStartup != null) {
      yield r'resource.resolver.vanitypath.maxEntries.startup';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodVanitypathPeriodMaxEntriesPeriodStartup,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodVanitypathPeriodBloomfilterPeriodMaxBytes != null) {
      yield r'resource.resolver.vanitypath.bloomfilter.maxBytes';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodVanitypathPeriodBloomfilterPeriodMaxBytes,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.resourcePeriodResolverPeriodOptimizePeriodAliasPeriodResolution != null) {
      yield r'resource.resolver.optimize.alias.resolution';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodOptimizePeriodAliasPeriodResolution,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodVanitypathPeriodWhitelist != null) {
      yield r'resource.resolver.vanitypath.whitelist';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodVanitypathPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodVanitypathPeriodBlacklist != null) {
      yield r'resource.resolver.vanitypath.blacklist';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodVanitypathPeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.resourcePeriodResolverPeriodVanityPeriodPrecedence != null) {
      yield r'resource.resolver.vanity.precedence';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodVanityPeriodPrecedence,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodProviderhandlingPeriodParanoid != null) {
      yield r'resource.resolver.providerhandling.paranoid';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodProviderhandlingPeriodParanoid,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodLogPeriodClosing != null) {
      yield r'resource.resolver.log.closing';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodLogPeriodClosing,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.resourcePeriodResolverPeriodLogPeriodUnclosed != null) {
      yield r'resource.resolver.log.unclosed';
      yield serializers.serialize(
        object.resourcePeriodResolverPeriodLogPeriodUnclosed,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'resource.resolver.searchpath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodSearchpath.replace(valueDes);
          break;
        case r'resource.resolver.manglenamespaces':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodManglenamespaces.replace(valueDes);
          break;
        case r'resource.resolver.allowDirect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodAllowDirect.replace(valueDes);
          break;
        case r'resource.resolver.required.providers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodRequiredPeriodProviders.replace(valueDes);
          break;
        case r'resource.resolver.required.providernames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodRequiredPeriodProvidernames.replace(valueDes);
          break;
        case r'resource.resolver.virtual':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodVirtual.replace(valueDes);
          break;
        case r'resource.resolver.mapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodMapping.replace(valueDes);
          break;
        case r'resource.resolver.map.location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodMapPeriodLocation.replace(valueDes);
          break;
        case r'resource.resolver.map.observation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodMapPeriodObservation.replace(valueDes);
          break;
        case r'resource.resolver.default.vanity.redirect.status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodDefaultPeriodVanityPeriodRedirectPeriodStatus.replace(valueDes);
          break;
        case r'resource.resolver.enable.vanitypath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodEnablePeriodVanitypath.replace(valueDes);
          break;
        case r'resource.resolver.vanitypath.maxEntries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodVanitypathPeriodMaxEntries.replace(valueDes);
          break;
        case r'resource.resolver.vanitypath.maxEntries.startup':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodVanitypathPeriodMaxEntriesPeriodStartup.replace(valueDes);
          break;
        case r'resource.resolver.vanitypath.bloomfilter.maxBytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodVanitypathPeriodBloomfilterPeriodMaxBytes.replace(valueDes);
          break;
        case r'resource.resolver.optimize.alias.resolution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodOptimizePeriodAliasPeriodResolution.replace(valueDes);
          break;
        case r'resource.resolver.vanitypath.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodVanitypathPeriodWhitelist.replace(valueDes);
          break;
        case r'resource.resolver.vanitypath.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodVanitypathPeriodBlacklist.replace(valueDes);
          break;
        case r'resource.resolver.vanity.precedence':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodVanityPeriodPrecedence.replace(valueDes);
          break;
        case r'resource.resolver.providerhandling.paranoid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodProviderhandlingPeriodParanoid.replace(valueDes);
          break;
        case r'resource.resolver.log.closing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodLogPeriodClosing.replace(valueDes);
          break;
        case r'resource.resolver.log.unclosed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.resourcePeriodResolverPeriodLogPeriodUnclosed.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder();
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

