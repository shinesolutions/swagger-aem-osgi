//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletMetadataGetServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodResourceTypes] 
/// * [slingPeriodServletPeriodMethods] 
/// * [slingPeriodServletPeriodExtensions] 
/// * [slingPeriodServletPeriodSelectors] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletMetadataGetServletProperties implements Built<ComDayCqDamCoreImplServletMetadataGetServletProperties, ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.resourceTypes')
  ConfigNodePropertyString? get slingPeriodServletPeriodResourceTypes;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyString? get slingPeriodServletPeriodMethods;

  @BuiltValueField(wireName: r'sling.servlet.extensions')
  ConfigNodePropertyString? get slingPeriodServletPeriodExtensions;

  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyString? get slingPeriodServletPeriodSelectors;

  ComDayCqDamCoreImplServletMetadataGetServletProperties._();

  factory ComDayCqDamCoreImplServletMetadataGetServletProperties([void updates(ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletMetadataGetServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletMetadataGetServletProperties> get serializer => _$ComDayCqDamCoreImplServletMetadataGetServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletMetadataGetServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletMetadataGetServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletMetadataGetServletProperties, _$ComDayCqDamCoreImplServletMetadataGetServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletMetadataGetServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletMetadataGetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodResourceTypes != null) {
      yield r'sling.servlet.resourceTypes';
      yield serializers.serialize(
        object.slingPeriodServletPeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodExtensions != null) {
      yield r'sling.servlet.extensions';
      yield serializers.serialize(
        object.slingPeriodServletPeriodExtensions,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodSelectors != null) {
      yield r'sling.servlet.selectors';
      yield serializers.serialize(
        object.slingPeriodServletPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletMetadataGetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodResourceTypes.replace(valueDes);
          break;
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        case r'sling.servlet.extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodExtensions.replace(valueDes);
          break;
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodSelectors.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletMetadataGetServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder();
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

