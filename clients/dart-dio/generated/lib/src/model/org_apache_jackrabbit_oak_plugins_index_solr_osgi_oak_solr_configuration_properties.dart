//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
///
/// Properties:
/// * [pathPeriodDescPeriodField] 
/// * [pathPeriodChildPeriodField] 
/// * [pathPeriodParentPeriodField] 
/// * [pathPeriodExactPeriodField] 
/// * [catchPeriodAllPeriodField] 
/// * [collapsedPeriodPathPeriodField] 
/// * [pathPeriodDepthPeriodField] 
/// * [commitPeriodPolicy] 
/// * [rows] 
/// * [pathPeriodRestrictions] 
/// * [propertyPeriodRestrictions] 
/// * [primarytypesPeriodRestrictions] 
/// * [ignoredPeriodProperties] 
/// * [usedPeriodProperties] 
/// * [typePeriodMappings] 
/// * [propertyPeriodMappings] 
/// * [collapsePeriodJcrcontentPeriodNodes] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties implements Built<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties, OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'path.desc.field')
  ConfigNodePropertyString? get pathPeriodDescPeriodField;

  @BuiltValueField(wireName: r'path.child.field')
  ConfigNodePropertyString? get pathPeriodChildPeriodField;

  @BuiltValueField(wireName: r'path.parent.field')
  ConfigNodePropertyString? get pathPeriodParentPeriodField;

  @BuiltValueField(wireName: r'path.exact.field')
  ConfigNodePropertyString? get pathPeriodExactPeriodField;

  @BuiltValueField(wireName: r'catch.all.field')
  ConfigNodePropertyString? get catchPeriodAllPeriodField;

  @BuiltValueField(wireName: r'collapsed.path.field')
  ConfigNodePropertyString? get collapsedPeriodPathPeriodField;

  @BuiltValueField(wireName: r'path.depth.field')
  ConfigNodePropertyString? get pathPeriodDepthPeriodField;

  @BuiltValueField(wireName: r'commit.policy')
  ConfigNodePropertyDropDown? get commitPeriodPolicy;

  @BuiltValueField(wireName: r'rows')
  ConfigNodePropertyInteger? get rows;

  @BuiltValueField(wireName: r'path.restrictions')
  ConfigNodePropertyBoolean? get pathPeriodRestrictions;

  @BuiltValueField(wireName: r'property.restrictions')
  ConfigNodePropertyBoolean? get propertyPeriodRestrictions;

  @BuiltValueField(wireName: r'primarytypes.restrictions')
  ConfigNodePropertyBoolean? get primarytypesPeriodRestrictions;

  @BuiltValueField(wireName: r'ignored.properties')
  ConfigNodePropertyArray? get ignoredPeriodProperties;

  @BuiltValueField(wireName: r'used.properties')
  ConfigNodePropertyArray? get usedPeriodProperties;

  @BuiltValueField(wireName: r'type.mappings')
  ConfigNodePropertyArray? get typePeriodMappings;

  @BuiltValueField(wireName: r'property.mappings')
  ConfigNodePropertyArray? get propertyPeriodMappings;

  @BuiltValueField(wireName: r'collapse.jcrcontent.nodes')
  ConfigNodePropertyBoolean? get collapsePeriodJcrcontentPeriodNodes;

  OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties([void updates(OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties, _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pathPeriodDescPeriodField != null) {
      yield r'path.desc.field';
      yield serializers.serialize(
        object.pathPeriodDescPeriodField,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pathPeriodChildPeriodField != null) {
      yield r'path.child.field';
      yield serializers.serialize(
        object.pathPeriodChildPeriodField,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pathPeriodParentPeriodField != null) {
      yield r'path.parent.field';
      yield serializers.serialize(
        object.pathPeriodParentPeriodField,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pathPeriodExactPeriodField != null) {
      yield r'path.exact.field';
      yield serializers.serialize(
        object.pathPeriodExactPeriodField,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.catchPeriodAllPeriodField != null) {
      yield r'catch.all.field';
      yield serializers.serialize(
        object.catchPeriodAllPeriodField,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.collapsedPeriodPathPeriodField != null) {
      yield r'collapsed.path.field';
      yield serializers.serialize(
        object.collapsedPeriodPathPeriodField,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pathPeriodDepthPeriodField != null) {
      yield r'path.depth.field';
      yield serializers.serialize(
        object.pathPeriodDepthPeriodField,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.commitPeriodPolicy != null) {
      yield r'commit.policy';
      yield serializers.serialize(
        object.commitPeriodPolicy,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.rows != null) {
      yield r'rows';
      yield serializers.serialize(
        object.rows,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.pathPeriodRestrictions != null) {
      yield r'path.restrictions';
      yield serializers.serialize(
        object.pathPeriodRestrictions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.propertyPeriodRestrictions != null) {
      yield r'property.restrictions';
      yield serializers.serialize(
        object.propertyPeriodRestrictions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.primarytypesPeriodRestrictions != null) {
      yield r'primarytypes.restrictions';
      yield serializers.serialize(
        object.primarytypesPeriodRestrictions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.ignoredPeriodProperties != null) {
      yield r'ignored.properties';
      yield serializers.serialize(
        object.ignoredPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.usedPeriodProperties != null) {
      yield r'used.properties';
      yield serializers.serialize(
        object.usedPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.typePeriodMappings != null) {
      yield r'type.mappings';
      yield serializers.serialize(
        object.typePeriodMappings,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.propertyPeriodMappings != null) {
      yield r'property.mappings';
      yield serializers.serialize(
        object.propertyPeriodMappings,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.collapsePeriodJcrcontentPeriodNodes != null) {
      yield r'collapse.jcrcontent.nodes';
      yield serializers.serialize(
        object.collapsePeriodJcrcontentPeriodNodes,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path.desc.field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pathPeriodDescPeriodField.replace(valueDes);
          break;
        case r'path.child.field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pathPeriodChildPeriodField.replace(valueDes);
          break;
        case r'path.parent.field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pathPeriodParentPeriodField.replace(valueDes);
          break;
        case r'path.exact.field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pathPeriodExactPeriodField.replace(valueDes);
          break;
        case r'catch.all.field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.catchPeriodAllPeriodField.replace(valueDes);
          break;
        case r'collapsed.path.field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.collapsedPeriodPathPeriodField.replace(valueDes);
          break;
        case r'path.depth.field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pathPeriodDepthPeriodField.replace(valueDes);
          break;
        case r'commit.policy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.commitPeriodPolicy.replace(valueDes);
          break;
        case r'rows':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.rows.replace(valueDes);
          break;
        case r'path.restrictions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.pathPeriodRestrictions.replace(valueDes);
          break;
        case r'property.restrictions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.propertyPeriodRestrictions.replace(valueDes);
          break;
        case r'primarytypes.restrictions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.primarytypesPeriodRestrictions.replace(valueDes);
          break;
        case r'ignored.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.ignoredPeriodProperties.replace(valueDes);
          break;
        case r'used.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.usedPeriodProperties.replace(valueDes);
          break;
        case r'type.mappings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.typePeriodMappings.replace(valueDes);
          break;
        case r'property.mappings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.propertyPeriodMappings.replace(valueDes);
          break;
        case r'collapse.jcrcontent.nodes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.collapsePeriodJcrcontentPeriodNodes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesBuilder();
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

