//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties.g.dart';

/// ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
///
/// Properties:
/// * [deletePeriodNamePeriodRegexps] 
@BuiltValue()
abstract class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties implements Built<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties, ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder> {
  @BuiltValueField(wireName: r'delete.name.regexps')
  ConfigNodePropertyArray? get deletePeriodNamePeriodRegexps;

  ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties._();

  factory ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties([void updates(ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder b)]) = _$ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties> get serializer => _$ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesSerializer();
}

class _$ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties, _$ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties];

  @override
  final String wireName = r'ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deletePeriodNamePeriodRegexps != null) {
      yield r'delete.name.regexps';
      yield serializers.serialize(
        object.deletePeriodNamePeriodRegexps,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'delete.name.regexps':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.deletePeriodNamePeriodRegexps.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder();
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

