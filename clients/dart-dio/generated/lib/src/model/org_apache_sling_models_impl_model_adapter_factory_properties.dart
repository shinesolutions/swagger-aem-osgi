//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_models_impl_model_adapter_factory_properties.g.dart';

/// OrgApacheSlingModelsImplModelAdapterFactoryProperties
///
/// Properties:
/// * [osgiPeriodHttpPeriodWhiteboardPeriodListener] 
/// * [osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect] 
/// * [maxPeriodRecursionPeriodDepth] 
/// * [cleanupPeriodJobPeriodPeriod] 
@BuiltValue()
abstract class OrgApacheSlingModelsImplModelAdapterFactoryProperties implements Built<OrgApacheSlingModelsImplModelAdapterFactoryProperties, OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'osgi.http.whiteboard.listener')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodListener;

  @BuiltValueField(wireName: r'osgi.http.whiteboard.context.select')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  @BuiltValueField(wireName: r'max.recursion.depth')
  ConfigNodePropertyInteger? get maxPeriodRecursionPeriodDepth;

  @BuiltValueField(wireName: r'cleanup.job.period')
  ConfigNodePropertyInteger? get cleanupPeriodJobPeriodPeriod;

  OrgApacheSlingModelsImplModelAdapterFactoryProperties._();

  factory OrgApacheSlingModelsImplModelAdapterFactoryProperties([void updates(OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder b)]) = _$OrgApacheSlingModelsImplModelAdapterFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingModelsImplModelAdapterFactoryProperties> get serializer => _$OrgApacheSlingModelsImplModelAdapterFactoryPropertiesSerializer();
}

class _$OrgApacheSlingModelsImplModelAdapterFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingModelsImplModelAdapterFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingModelsImplModelAdapterFactoryProperties, _$OrgApacheSlingModelsImplModelAdapterFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingModelsImplModelAdapterFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingModelsImplModelAdapterFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodListener != null) {
      yield r'osgi.http.whiteboard.listener';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodListener,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect != null) {
      yield r'osgi.http.whiteboard.context.select';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxPeriodRecursionPeriodDepth != null) {
      yield r'max.recursion.depth';
      yield serializers.serialize(
        object.maxPeriodRecursionPeriodDepth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cleanupPeriodJobPeriodPeriod != null) {
      yield r'cleanup.job.period';
      yield serializers.serialize(
        object.cleanupPeriodJobPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingModelsImplModelAdapterFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'osgi.http.whiteboard.listener':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodListener.replace(valueDes);
          break;
        case r'osgi.http.whiteboard.context.select':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect.replace(valueDes);
          break;
        case r'max.recursion.depth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodRecursionPeriodDepth.replace(valueDes);
          break;
        case r'cleanup.job.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cleanupPeriodJobPeriodPeriod.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingModelsImplModelAdapterFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder();
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

