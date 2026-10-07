//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_repository_hc_impl_disk_space_health_check_properties.g.dart';

/// ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
/// * [diskPeriodSpacePeriodWarnPeriodThreshold] 
/// * [diskPeriodSpacePeriodErrorPeriodThreshold] 
@BuiltValue()
abstract class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties implements Built<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'disk.space.warn.threshold')
  ConfigNodePropertyInteger? get diskPeriodSpacePeriodWarnPeriodThreshold;

  @BuiltValueField(wireName: r'disk.space.error.threshold')
  ConfigNodePropertyInteger? get diskPeriodSpacePeriodErrorPeriodThreshold;

  ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties._();

  factory ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties([void updates(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties> get serializer => _$ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties, _$ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.diskPeriodSpacePeriodWarnPeriodThreshold != null) {
      yield r'disk.space.warn.threshold';
      yield serializers.serialize(
        object.diskPeriodSpacePeriodWarnPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.diskPeriodSpacePeriodErrorPeriodThreshold != null) {
      yield r'disk.space.error.threshold';
      yield serializers.serialize(
        object.diskPeriodSpacePeriodErrorPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'disk.space.warn.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.diskPeriodSpacePeriodWarnPeriodThreshold.replace(valueDes);
          break;
        case r'disk.space.error.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.diskPeriodSpacePeriodErrorPeriodThreshold.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder();
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

