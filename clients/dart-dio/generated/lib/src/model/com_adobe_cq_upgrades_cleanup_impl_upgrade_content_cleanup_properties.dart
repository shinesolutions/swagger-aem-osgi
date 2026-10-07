//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties.g.dart';

/// ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
///
/// Properties:
/// * [deletePeriodPathPeriodRegexps] 
/// * [deletePeriodSql2PeriodQuery] 
@BuiltValue()
abstract class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties implements Built<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder> {
  @BuiltValueField(wireName: r'delete.path.regexps')
  ConfigNodePropertyArray? get deletePeriodPathPeriodRegexps;

  @BuiltValueField(wireName: r'delete.sql2.query')
  ConfigNodePropertyString? get deletePeriodSql2PeriodQuery;

  ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties._();

  factory ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties([void updates(ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder b)]) = _$ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties> get serializer => _$ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesSerializer();
}

class _$ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties, _$ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties];

  @override
  final String wireName = r'ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deletePeriodPathPeriodRegexps != null) {
      yield r'delete.path.regexps';
      yield serializers.serialize(
        object.deletePeriodPathPeriodRegexps,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.deletePeriodSql2PeriodQuery != null) {
      yield r'delete.sql2.query';
      yield serializers.serialize(
        object.deletePeriodSql2PeriodQuery,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'delete.path.regexps':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.deletePeriodPathPeriodRegexps.replace(valueDes);
          break;
        case r'delete.sql2.query':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.deletePeriodSql2PeriodQuery.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesBuilder();
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

