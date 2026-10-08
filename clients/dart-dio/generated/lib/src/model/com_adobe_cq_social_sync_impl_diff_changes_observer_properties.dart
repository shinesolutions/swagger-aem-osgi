//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_sync_impl_diff_changes_observer_properties.g.dart';

/// ComAdobeCqSocialSyncImplDiffChangesObserverProperties
///
/// Properties:
/// * [enabled] 
/// * [agentName] 
/// * [diffPath] 
/// * [propertyNames] 
@BuiltValue()
abstract class ComAdobeCqSocialSyncImplDiffChangesObserverProperties implements Built<ComAdobeCqSocialSyncImplDiffChangesObserverProperties, ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'agentName')
  ConfigNodePropertyString? get agentName;

  @BuiltValueField(wireName: r'diffPath')
  ConfigNodePropertyString? get diffPath;

  @BuiltValueField(wireName: r'propertyNames')
  ConfigNodePropertyString? get propertyNames;

  ComAdobeCqSocialSyncImplDiffChangesObserverProperties._();

  factory ComAdobeCqSocialSyncImplDiffChangesObserverProperties([void updates(ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder b)]) = _$ComAdobeCqSocialSyncImplDiffChangesObserverProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialSyncImplDiffChangesObserverProperties> get serializer => _$ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesSerializer();
}

class _$ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialSyncImplDiffChangesObserverProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialSyncImplDiffChangesObserverProperties, _$ComAdobeCqSocialSyncImplDiffChangesObserverProperties];

  @override
  final String wireName = r'ComAdobeCqSocialSyncImplDiffChangesObserverProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.agentName != null) {
      yield r'agentName';
      yield serializers.serialize(
        object.agentName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.diffPath != null) {
      yield r'diffPath';
      yield serializers.serialize(
        object.diffPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.propertyNames != null) {
      yield r'propertyNames';
      yield serializers.serialize(
        object.propertyNames,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'agentName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.agentName.replace(valueDes);
          break;
        case r'diffPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.diffPath.replace(valueDes);
          break;
        case r'propertyNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.propertyNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialSyncImplDiffChangesObserverProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder();
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

