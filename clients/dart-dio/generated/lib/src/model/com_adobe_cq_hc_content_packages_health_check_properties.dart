//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_hc_content_packages_health_check_properties.g.dart';

/// ComAdobeCqHcContentPackagesHealthCheckProperties
///
/// Properties:
/// * [hcPeriodName] 
/// * [hcPeriodTags] 
/// * [hcPeriodMbeanPeriodName] 
/// * [packagePeriodNames] 
@BuiltValue()
abstract class ComAdobeCqHcContentPackagesHealthCheckProperties implements Built<ComAdobeCqHcContentPackagesHealthCheckProperties, ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.name')
  ConfigNodePropertyString? get hcPeriodName;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'hc.mbean.name')
  ConfigNodePropertyString? get hcPeriodMbeanPeriodName;

  @BuiltValueField(wireName: r'package.names')
  ConfigNodePropertyArray? get packagePeriodNames;

  ComAdobeCqHcContentPackagesHealthCheckProperties._();

  factory ComAdobeCqHcContentPackagesHealthCheckProperties([void updates(ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder b)]) = _$ComAdobeCqHcContentPackagesHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqHcContentPackagesHealthCheckProperties> get serializer => _$ComAdobeCqHcContentPackagesHealthCheckPropertiesSerializer();
}

class _$ComAdobeCqHcContentPackagesHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqHcContentPackagesHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqHcContentPackagesHealthCheckProperties, _$ComAdobeCqHcContentPackagesHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeCqHcContentPackagesHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqHcContentPackagesHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodName != null) {
      yield r'hc.name';
      yield serializers.serialize(
        object.hcPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.hcPeriodMbeanPeriodName != null) {
      yield r'hc.mbean.name';
      yield serializers.serialize(
        object.hcPeriodMbeanPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.packagePeriodNames != null) {
      yield r'package.names';
      yield serializers.serialize(
        object.packagePeriodNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqHcContentPackagesHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodName.replace(valueDes);
          break;
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'hc.mbean.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodMbeanPeriodName.replace(valueDes);
          break;
        case r'package.names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.packagePeriodNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqHcContentPackagesHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqHcContentPackagesHealthCheckPropertiesBuilder();
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

