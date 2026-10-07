//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_float.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_eventadmin_impl_event_admin_properties.g.dart';

/// OrgApacheFelixEventadminImplEventAdminProperties
///
/// Properties:
/// * [orgPeriodApachePeriodFelixPeriodEventadminPeriodThreadPoolSize] 
/// * [orgPeriodApachePeriodFelixPeriodEventadminPeriodAsyncToSyncThreadRatio] 
/// * [orgPeriodApachePeriodFelixPeriodEventadminPeriodTimeout] 
/// * [orgPeriodApachePeriodFelixPeriodEventadminPeriodRequireTopic] 
/// * [orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTimeout] 
/// * [orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTopic] 
@BuiltValue()
abstract class OrgApacheFelixEventadminImplEventAdminProperties implements Built<OrgApacheFelixEventadminImplEventAdminProperties, OrgApacheFelixEventadminImplEventAdminPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.felix.eventadmin.ThreadPoolSize')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodEventadminPeriodThreadPoolSize;

  @BuiltValueField(wireName: r'org.apache.felix.eventadmin.AsyncToSyncThreadRatio')
  ConfigNodePropertyFloat? get orgPeriodApachePeriodFelixPeriodEventadminPeriodAsyncToSyncThreadRatio;

  @BuiltValueField(wireName: r'org.apache.felix.eventadmin.Timeout')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodEventadminPeriodTimeout;

  @BuiltValueField(wireName: r'org.apache.felix.eventadmin.RequireTopic')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodEventadminPeriodRequireTopic;

  @BuiltValueField(wireName: r'org.apache.felix.eventadmin.IgnoreTimeout')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTimeout;

  @BuiltValueField(wireName: r'org.apache.felix.eventadmin.IgnoreTopic')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTopic;

  OrgApacheFelixEventadminImplEventAdminProperties._();

  factory OrgApacheFelixEventadminImplEventAdminProperties([void updates(OrgApacheFelixEventadminImplEventAdminPropertiesBuilder b)]) = _$OrgApacheFelixEventadminImplEventAdminProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixEventadminImplEventAdminPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixEventadminImplEventAdminProperties> get serializer => _$OrgApacheFelixEventadminImplEventAdminPropertiesSerializer();
}

class _$OrgApacheFelixEventadminImplEventAdminPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixEventadminImplEventAdminProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixEventadminImplEventAdminProperties, _$OrgApacheFelixEventadminImplEventAdminProperties];

  @override
  final String wireName = r'OrgApacheFelixEventadminImplEventAdminProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixEventadminImplEventAdminProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodFelixPeriodEventadminPeriodThreadPoolSize != null) {
      yield r'org.apache.felix.eventadmin.ThreadPoolSize';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodEventadminPeriodThreadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodEventadminPeriodAsyncToSyncThreadRatio != null) {
      yield r'org.apache.felix.eventadmin.AsyncToSyncThreadRatio';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodEventadminPeriodAsyncToSyncThreadRatio,
        specifiedType: const FullType(ConfigNodePropertyFloat),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodEventadminPeriodTimeout != null) {
      yield r'org.apache.felix.eventadmin.Timeout';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodEventadminPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodEventadminPeriodRequireTopic != null) {
      yield r'org.apache.felix.eventadmin.RequireTopic';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodEventadminPeriodRequireTopic,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTimeout != null) {
      yield r'org.apache.felix.eventadmin.IgnoreTimeout';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTimeout,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTopic != null) {
      yield r'org.apache.felix.eventadmin.IgnoreTopic';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTopic,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixEventadminImplEventAdminProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixEventadminImplEventAdminPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.felix.eventadmin.ThreadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodEventadminPeriodThreadPoolSize.replace(valueDes);
          break;
        case r'org.apache.felix.eventadmin.AsyncToSyncThreadRatio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyFloat),
          ) as ConfigNodePropertyFloat?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodEventadminPeriodAsyncToSyncThreadRatio.replace(valueDes);
          break;
        case r'org.apache.felix.eventadmin.Timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodEventadminPeriodTimeout.replace(valueDes);
          break;
        case r'org.apache.felix.eventadmin.RequireTopic':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodEventadminPeriodRequireTopic.replace(valueDes);
          break;
        case r'org.apache.felix.eventadmin.IgnoreTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTimeout.replace(valueDes);
          break;
        case r'org.apache.felix.eventadmin.IgnoreTopic':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodEventadminPeriodIgnoreTopic.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixEventadminImplEventAdminProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixEventadminImplEventAdminPropertiesBuilder();
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

