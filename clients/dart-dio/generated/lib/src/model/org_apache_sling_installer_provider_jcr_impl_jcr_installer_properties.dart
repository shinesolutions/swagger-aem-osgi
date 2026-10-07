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

part 'org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties.g.dart';

/// OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
///
/// Properties:
/// * [handlerPeriodSchemes] 
/// * [slingPeriodJcrinstallPeriodFolderPeriodNamePeriodRegexp] 
/// * [slingPeriodJcrinstallPeriodFolderPeriodMaxPeriodDepth] 
/// * [slingPeriodJcrinstallPeriodSearchPeriodPath] 
/// * [slingPeriodJcrinstallPeriodNewPeriodConfigPeriodPath] 
/// * [slingPeriodJcrinstallPeriodSignalPeriodPath] 
/// * [slingPeriodJcrinstallPeriodEnablePeriodWriteback] 
@BuiltValue()
abstract class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties implements Built<OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties, OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder> {
  @BuiltValueField(wireName: r'handler.schemes')
  ConfigNodePropertyArray? get handlerPeriodSchemes;

  @BuiltValueField(wireName: r'sling.jcrinstall.folder.name.regexp')
  ConfigNodePropertyString? get slingPeriodJcrinstallPeriodFolderPeriodNamePeriodRegexp;

  @BuiltValueField(wireName: r'sling.jcrinstall.folder.max.depth')
  ConfigNodePropertyInteger? get slingPeriodJcrinstallPeriodFolderPeriodMaxPeriodDepth;

  @BuiltValueField(wireName: r'sling.jcrinstall.search.path')
  ConfigNodePropertyArray? get slingPeriodJcrinstallPeriodSearchPeriodPath;

  @BuiltValueField(wireName: r'sling.jcrinstall.new.config.path')
  ConfigNodePropertyString? get slingPeriodJcrinstallPeriodNewPeriodConfigPeriodPath;

  @BuiltValueField(wireName: r'sling.jcrinstall.signal.path')
  ConfigNodePropertyString? get slingPeriodJcrinstallPeriodSignalPeriodPath;

  @BuiltValueField(wireName: r'sling.jcrinstall.enable.writeback')
  ConfigNodePropertyBoolean? get slingPeriodJcrinstallPeriodEnablePeriodWriteback;

  OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties._();

  factory OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties([void updates(OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder b)]) = _$OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties> get serializer => _$OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSerializer();
}

class _$OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties, _$OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties];

  @override
  final String wireName = r'OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.handlerPeriodSchemes != null) {
      yield r'handler.schemes';
      yield serializers.serialize(
        object.handlerPeriodSchemes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodJcrinstallPeriodFolderPeriodNamePeriodRegexp != null) {
      yield r'sling.jcrinstall.folder.name.regexp';
      yield serializers.serialize(
        object.slingPeriodJcrinstallPeriodFolderPeriodNamePeriodRegexp,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodJcrinstallPeriodFolderPeriodMaxPeriodDepth != null) {
      yield r'sling.jcrinstall.folder.max.depth';
      yield serializers.serialize(
        object.slingPeriodJcrinstallPeriodFolderPeriodMaxPeriodDepth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.slingPeriodJcrinstallPeriodSearchPeriodPath != null) {
      yield r'sling.jcrinstall.search.path';
      yield serializers.serialize(
        object.slingPeriodJcrinstallPeriodSearchPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodJcrinstallPeriodNewPeriodConfigPeriodPath != null) {
      yield r'sling.jcrinstall.new.config.path';
      yield serializers.serialize(
        object.slingPeriodJcrinstallPeriodNewPeriodConfigPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodJcrinstallPeriodSignalPeriodPath != null) {
      yield r'sling.jcrinstall.signal.path';
      yield serializers.serialize(
        object.slingPeriodJcrinstallPeriodSignalPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodJcrinstallPeriodEnablePeriodWriteback != null) {
      yield r'sling.jcrinstall.enable.writeback';
      yield serializers.serialize(
        object.slingPeriodJcrinstallPeriodEnablePeriodWriteback,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'handler.schemes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.handlerPeriodSchemes.replace(valueDes);
          break;
        case r'sling.jcrinstall.folder.name.regexp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodJcrinstallPeriodFolderPeriodNamePeriodRegexp.replace(valueDes);
          break;
        case r'sling.jcrinstall.folder.max.depth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.slingPeriodJcrinstallPeriodFolderPeriodMaxPeriodDepth.replace(valueDes);
          break;
        case r'sling.jcrinstall.search.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodJcrinstallPeriodSearchPeriodPath.replace(valueDes);
          break;
        case r'sling.jcrinstall.new.config.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodJcrinstallPeriodNewPeriodConfigPeriodPath.replace(valueDes);
          break;
        case r'sling.jcrinstall.signal.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodJcrinstallPeriodSignalPeriodPath.replace(valueDes);
          break;
        case r'sling.jcrinstall.enable.writeback':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.slingPeriodJcrinstallPeriodEnablePeriodWriteback.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder();
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

